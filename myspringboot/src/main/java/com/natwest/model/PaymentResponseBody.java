package com.natwest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentResponseBody {

    @JsonProperty("payload")
    private String payload;

    public PaymentResponseBody() {
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
