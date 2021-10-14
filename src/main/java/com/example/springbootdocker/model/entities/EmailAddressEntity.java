package com.example.springbootdocker.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "emailaddresses")
public class EmailAddressEntity { // one to many

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String emailaddress;

    @ManyToOne
    @JoinColumn(name = "person_id")
    // @JsonBackReference
    private PersonEntity person;

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
