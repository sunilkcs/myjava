package com.natwest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequestBody {

    public PaymentRequestBody() {
    }

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("payload")
    private String payload;
    @JsonProperty("cinIdentifier")
    private String cinIdentifier;
    @JsonProperty("debitAccountIdentifier")
    private String debitAccountIdentifier;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getCinIdentifier() {
        return cinIdentifier;
    }

    public void setCinIdentifier(String cinIdentifier) {
        this.cinIdentifier = cinIdentifier;
    }

    public String getDebitAccountIdentifier() {
        return debitAccountIdentifier;
    }

    public void setDebitAccountIdentifier(String debitAccountIdentifier) {
        this.debitAccountIdentifier = debitAccountIdentifier;
    }

}
