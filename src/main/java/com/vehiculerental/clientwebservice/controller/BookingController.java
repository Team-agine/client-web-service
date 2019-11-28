package com.vehiculerental.clientwebservice.controller;


import com.vehiculerental.clientwebservice.model.Booking;
import com.vehiculerental.clientwebservice.form.ValidationForm;
import com.vehiculerental.clientwebservice.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class BookingController {

    /**
     *
     */
    @Autowired
    private RestTemplate restTemplate;

    private int retryCount = 0;

//    @GetMapping(value = "/vehicles")
//    public String show(Model model) throws InterruptedException {
//        List<Vehicle> vehicles = new ArrayList<>();
//        try {
//            ResponseEntity<Vehicle[]> response = restTemplate.getForEntity("http://vehicles-api/vehicles", Vehicle[].class);
//            model.addAttribute("vehicles", Arrays.asList((Vehicle[]) response.getBody()));
//        } catch (RestClientException e) {
//            retryCount++;
//            if (retryCount <= 3) {
//                Thread.sleep(500);
//                return show(model);
//            }
//            model.addAttribute("vehicles", vehicles);
//        } catch (Exception e) {
//            return e.getMessage();
//        }
//
//        retryCount = 0;
//        return "vehicle/show";
//    }

    @GetMapping(value = "/booking/validation-form")
    public String showAddForm(Model model) {
        ValidationForm validationForm = new ValidationForm();
        model.addAttribute("validationForm", validationForm);
        return "booking/validation-form";
    }
//
//    @PostMapping(value = "/vehicles/new")
//    public String checkVehicleInfo(@Valid Vehicle vehicle, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "vehicle/add";
//        }
//        restTemplate.postForObject("http://vehicles-api/vehicles", vehicle, Vehicle.class);
//        return "redirect:/vehicles";
//    }

    /**
     * Valide le formulaire
     *
     * @param validationForm et return results.
     */
    @PostMapping(value = "booking/first-validation")
    public String checkBookingInfo(@Valid ValidationForm validationForm, BindingResult bindingResult) throws ParseException {
//        if (bindingResult.hasErrors()) {
//            return "validationForm";
//        }

        ResponseEntity<Vehicle[]> result = restTemplate.postForEntity("http://bookings-api/bookings/vehicles-available", validationForm, Vehicle[].class);
        System.out.println(result);
        return "redirect:/";
    }

    @DeleteMapping(value = "/vehicles/{id}")
    public String remove(@PathVariable Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://vehicles-api/vehicles" + id;
        restTemplate.delete(url);
        return "redirect:/vehicles";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy/MM/dd"), true));
    }
}
