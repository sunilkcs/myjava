package com.natwest.model;

public class AccountFlagsInternationalResponse {

    String accountName;
    AccountFlagsInternational accountFlags;

    public AccountFlagsInternationalResponse() {
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountFlagsInternational getAccountFlags() {
        return accountFlags;
    }

    public void setAccountFlags(AccountFlagsInternational accountFlags) {
        this.accountFlags = accountFlags;
    }
}
