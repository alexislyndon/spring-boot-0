package com.example.springbootdocker.model.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

// import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "emailaddresses")
public class EmailAddressEntity { // one to many

    public EmailAddressEntity(){
        super();
    }

    public UUID getP_id() {
        return p_id;
    }

    public void setP_id(UUID p_id) {
        this.p_id = p_id;
    }

    public EmailAddressEntity(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public EmailAddressEntity(String emailaddress, PersonEntity person) {
        this.emailaddress = emailaddress;
        this. person = person;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String emailaddress;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    @JsonBackReference
    private PersonEntity person;


    @JoinColumn(name = "p_id")
    @JsonBackReference
    private UUID p_id;

    public String getEmailaddress() {
        return emailaddress;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    // this.setPerson(this.person);
}
