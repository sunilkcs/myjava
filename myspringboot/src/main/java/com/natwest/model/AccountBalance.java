package com.natwest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountBalance {

    public AccountBalance() {
    }

    @JsonProperty("unclearedBalance")
    private double unclearedBalance;
    @JsonProperty("clearedBalance")
    private double clearedBalance;

    public double getUnclearedBalance() {
        return unclearedBalance;
    }

    public void setUnclearedBalance(double unclearedBalance) {
        this.unclearedBalance = unclearedBalance;
    }

    public double getClearedBalance() {
        return clearedBalance;
    }

    public void setClearedBalance(double clearedBalance) {
        this.clearedBalance = clearedBalance;
    }
}
