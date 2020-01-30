package com.natwest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "branchId",
        "accountId",
        "currency",
        "customerKey",
        "iban",
        "relationshipTypeCode",
        "relatedEntityCustomerType",
        "productIdentifier",
        "accountType",
        "uniqueId",
        "ibanSortCode"
})
public class Account {

    @JsonProperty("branchId")
    private String branchId;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("customerKey")
    private Object customerKey;
    @JsonProperty("iban")
    private Object iban;
    @JsonProperty("relationshipTypeCode")
    private String relationshipTypeCode;
    @JsonProperty("relatedEntityCustomerType")
    private String relatedEntityCustomerType;
    @JsonProperty("productIdentifier")
    private String productIdentifier;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("uniqueId")
    private String uniqueId;
    @JsonProperty("ibanSortCode")
    private Object ibanSortCode;

    @JsonProperty("branchId")
    public String getBranchId() {
        return branchId;
    }

    @JsonProperty("branchId")
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("customerKey")
    public Object getCustomerKey() {
        return customerKey;
    }

    @JsonProperty("customerKey")
    public void setCustomerKey(Object customerKey) {
        this.customerKey = customerKey;
    }

    @JsonProperty("iban")
    public Object getIban() {
        return iban;
    }

    @JsonProperty("iban")
    public void setIban(Object iban) {
        this.iban = iban;
    }

    @JsonProperty("relationshipTypeCode")
    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    @JsonProperty("relationshipTypeCode")
    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    @JsonProperty("relatedEntityCustomerType")
    public String getRelatedEntityCustomerType() {
        return relatedEntityCustomerType;
    }

    @JsonProperty("relatedEntityCustomerType")
    public void setRelatedEntityCustomerType(String relatedEntityCustomerType) {
        this.relatedEntityCustomerType = relatedEntityCustomerType;
    }

    @JsonProperty("productIdentifier")
    public String getProductIdentifier() {
        return productIdentifier;
    }

    @JsonProperty("productIdentifier")
    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("uniqueId")
    public String getUniqueId() {
        return uniqueId;
    }

    @JsonProperty("uniqueId")
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @JsonProperty("ibanSortCode")
    public Object getIbanSortCode() {
        return ibanSortCode;
    }

    @JsonProperty("ibanSortCode")
    public void setIbanSortCode(Object ibanSortCode) {
        this.ibanSortCode = ibanSortCode;
    }

}