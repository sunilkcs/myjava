package com.natwest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "line1",
        "line2",
        "line3",
        "line4",
        "postalCode",
        "country"
})
public class Address {

    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("line3")
    private Object line3;
    @JsonProperty("line4")
    private Object line4;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("country")
    private String country;

    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @JsonProperty("line3")
    public Object getLine3() {
        return line3;
    }

    @JsonProperty("line3")
    public void setLine3(Object line3) {
        this.line3 = line3;
    }

    @JsonProperty("line4")
    public Object getLine4() {
        return line4;
    }

    @JsonProperty("line4")
    public void setLine4(Object line4) {
        this.line4 = line4;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

}