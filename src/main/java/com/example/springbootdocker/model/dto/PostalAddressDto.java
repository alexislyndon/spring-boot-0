package com.example.springbootdocker.model.dto;

public class PostalAddressDto {
    
    private String street;
    private String city;
    private String zipcode;
    // private UUID p_id;
    public String getStreet() {
        return street;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}
