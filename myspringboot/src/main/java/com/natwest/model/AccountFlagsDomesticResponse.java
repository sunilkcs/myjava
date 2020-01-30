package com.natwest.model;

public class AccountFlagsDomesticResponse {

    String accountName;
    AccountFlagsDomestic accountFlags;

    public AccountFlagsDomesticResponse() {
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountFlagsDomestic getAccountFlags() {
        return accountFlags;
    }

    public void setAccountFlags(AccountFlagsDomestic accountFlags) {
        this.accountFlags = accountFlags;
    }
}
