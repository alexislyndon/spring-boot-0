package com.example.springbootdocker.model.entities;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.GenericGenerator;
// import org.hibernate.type.UUIDCharType;
import org.hibernate.type.UUIDCharType;

// import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "people")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    // @Id
    @Column(name = "p_id", unique = true)
    @GeneratedValue(generator = "uuid4")
    @GenericGenerator(name = "uuid4", strategy = "uuid4")
    @JsonManagedReference
    private UUID pid;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<EmailAddressEntity> emailaddresses; // = new ArrayList<>();

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<PostalAddressEntity> postaladdresses;

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getPid() {
        return pid;
    }

    public void setPid(UUID pid) {
        this.pid = pid;
    }

    public List<PostalAddressEntity> getPostaladdresses() {
        return postaladdresses;
    }

    public void setPostaladdressess(List<PostalAddressEntity> postaladdressess) {
        this.postaladdresses = postaladdressess;
    }

    public Long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<EmailAddressEntity> getEmailaddresses() {
        return this.emailaddresses;
    }
}
