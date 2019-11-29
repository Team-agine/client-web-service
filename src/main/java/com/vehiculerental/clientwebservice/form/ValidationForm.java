package com.vehiculerental.clientwebservice.form;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ValidationForm {

    private String userId;

    private Date startDate;

    private Date endDate;

    private String vehiculeId;

    private String estimatedKim;

    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public String getEstimatedKim() {
        return estimatedKim;
    }

    public void setEstimatedKim(String estimatedKim) {
        this.estimatedKim = estimatedKim;
    }

    public String getUserId() {
        return userId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
