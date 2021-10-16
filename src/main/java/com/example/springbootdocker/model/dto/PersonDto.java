package com.example.springbootdocker.model.dto;

// import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class PersonDto {
    
    private Long id;
    private String firstname;
    private String lastname;
    private UUID p_id;

    // @JsonSerialize(converter = ListEmailAddressDtoConverter.class)
    private List<EmailAddressDto> emailaddresses;

    private List<PostalAddressDto> postaladdresses;
    
    public PersonDto() {
        super();
    }

    public UUID getP_id() {
        return p_id;
    }

    public void setP_id(UUID p_id) {
        this.p_id = p_id;
    }

    public List<PostalAddressDto> getPostaladdresses() {
        return postaladdresses;
    }

    public void setPostaladdresses(List<PostalAddressDto> postaladdressess) {
        this.postaladdresses = postaladdressess;
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
