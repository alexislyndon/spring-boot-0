package com.example.springbootdocker.model.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public class EmailAddressDto {

    // private Long id;
    @JsonValue
    private String emailaddress;
    // private Long personId;

    // public Long getId() {
    //     return id;
    // }

    // public Long getPersonId() {
    //     return personId;
    // }

    // public void setPersonId(Long personId) {
    //     this.personId = personId;
    // }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    // public void setId(Long id) {
    //     this.id = id;
    // }
}
