package com.example.springbootdocker.model.dto;

// import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class PersonDto {
    
    private Long id;
    private String firstname;
    private String lastname;

    @JsonSerialize(converter = ListEmailAddressDtoConverter.class)
    private List<EmailAddressDto> emailaddresses;
    
    public PersonDto() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
