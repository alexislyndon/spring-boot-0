package com.example.springbootdocker.model.dto;

import java.util.ArrayList;
import java.util.List;

public class PersonDto {


    public PersonDto() {
        super();
    }

    public PersonDto(String firstname, String lastname, List<EmailAddressDto> emailaddresses) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailaddresses = emailaddresses;

    }

    public PersonDto(String firstname, String lastname) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public List<EmailAddressDto> getEmailaddresses() {
        return emailaddresses;
    }

    public void setEmailaddresses(List<EmailAddressDto> emailaddresses) {
        this.emailaddresses = emailaddresses;
    }

    private String firstname;
    private String lastname;
    private List<EmailAddressDto> emailaddresses = new ArrayList<>();

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

}
