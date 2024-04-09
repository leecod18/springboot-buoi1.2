package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;

public class HelloResponse {

    private String action;
    private String email;
    @JsonProperty("timezone_offset_min")
    private Integer timezoneOffsetMin;//(snake case)


    //camelCase
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getTimezoneOffsetMin() {
        return timezoneOffsetMin;
    }

    public void setTimezoneOffsetMin(Integer timezoneOffsetMin) {
        this.timezoneOffsetMin = timezoneOffsetMin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // if delete both get then error 406
}
