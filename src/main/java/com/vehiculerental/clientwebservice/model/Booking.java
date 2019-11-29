package com.vehiculerental.clientwebservice.model;

import javax.validation.constraints.NotNull;


public class Booking {
    /**
     * booking Id
     */
    private String bookingId;



    public Booking() {}


public String getBookingId() {
    return bookingId;
}

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
