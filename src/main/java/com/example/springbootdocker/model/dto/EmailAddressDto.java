package com.example.springbootdocker.model.dto;

public class EmailAddressDto {

    private Long id;
    private String emailaddress;
    private PersonDto person;

    public Long getId() {
        return id;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
