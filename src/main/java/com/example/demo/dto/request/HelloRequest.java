package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

public class HelloRequest {
    @NotEmpty
    private String action;

    @Email
    @NotNull
    private String email;

   @JsonProperty("timezone_offset_min")
   @Min(-11)
   @Max(12)
    private Integer timezoneOffsetMin;

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
}
