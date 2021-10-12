package com.example.springbootdocker.controllers;

import com.example.springbootdocker.model.dto.PersonDto;
import com.example.springbootdocker.services.PeopleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacts")
public class HomeController {

    @Autowired
    private PeopleService peopleService;

    // public HomeController(PeopleService peopleService) {
    //     super();

    //     this.peopleService = peopleService;
    // }

    @GetMapping
    public Iterable<PersonDto> getContacts() {
        var svc = peopleService;

        var result = svc.getpeople();

        return result;
        // return null;
    }

    @GetMapping("person/{firstname}")
    public PersonDto sayHello(@PathVariable String firstname, @RequestParam String lastname) {

        PersonDto person = new PersonDto(firstname, lastname);

        return person;
    }
}
