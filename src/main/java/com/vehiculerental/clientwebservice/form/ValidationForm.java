package com.vehiculerental.clientwebservice.form;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ValidationForm {

    private String userId;


  //  @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date startDate;


//    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date endDate;

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
