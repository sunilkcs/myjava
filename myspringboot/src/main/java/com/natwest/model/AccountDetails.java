package com.natwest.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "accounts"
})
public class AccountDetails {

    @JsonProperty("accounts")
    private List<Account> accounts = null;

    @JsonProperty("accounts")
    public List<Account> getAccounts() {
        return accounts;
    }

    @JsonProperty("accounts")
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}