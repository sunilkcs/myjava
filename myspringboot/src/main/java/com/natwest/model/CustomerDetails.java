package com.natwest.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "firstName",
        "lastName",
        "address",
        "phoneNumbers",
        "mobilePhoneNumbers",
        "landlinePhoneNumbers",
        "email",
        "title",
        "firstContactDate"
})
public class CustomerDetails {

    @JsonProperty("name")
    private String name;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("phoneNumbers")
    private List<String> phoneNumbers = null;
    @JsonProperty("mobilePhoneNumbers")
    private List<String> mobilePhoneNumbers = null;
    @JsonProperty("landlinePhoneNumbers")
    private List<Object> landlinePhoneNumbers = null;
    @JsonProperty("email")
    private String email;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("firstContactDate")
    private String firstContactDate;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("phoneNumbers")
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("mobilePhoneNumbers")
    public List<String> getMobilePhoneNumbers() {
        return mobilePhoneNumbers;
    }

    @JsonProperty("mobilePhoneNumbers")
    public void setMobilePhoneNumbers(List<String> mobilePhoneNumbers) {
        this.mobilePhoneNumbers = mobilePhoneNumbers;
    }

    @JsonProperty("landlinePhoneNumbers")
    public List<Object> getLandlinePhoneNumbers() {
        return landlinePhoneNumbers;
    }

    @JsonProperty("landlinePhoneNumbers")
    public void setLandlinePhoneNumbers(List<Object> landlinePhoneNumbers) {
        this.landlinePhoneNumbers = landlinePhoneNumbers;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("firstContactDate")
    public String getFirstContactDate() {
        return firstContactDate;
    }

    @JsonProperty("firstContactDate")
    public void setFirstContactDate(String firstContactDate) {
        this.firstContactDate = firstContactDate;
    }

}