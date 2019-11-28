package com.vehiculerental.clientwebservice.model;

import javax.validation.constraints.NotNull;


public class Booking {
    /**
     * User Id
     */
    private String userid;

    /**
     * Booking starting date
     */
    @NotNull(message = "Ce champ ne peut être null.")
    private String startDate;

    /**
     * Booking ending date
     */
    @NotNull(message = "Ce champ ne peut être null.")
    private String endDate;


    public Booking() {}

    /**
     * @param userId
     * @param startDate
     * @param endDate

     */

    public Booking(String userId, String startDate, String endDate) {
        this.userid = userId;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getUserid() {
        return userid;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
