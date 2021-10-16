package com.example.springbootdocker.controllers;


import java.util.UUID;

import com.example.springbootdocker.model.dto.PersonDto;
import com.example.springbootdocker.model.entities.PersonEntity;
import com.example.springbootdocker.services.PeopleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("contacts")
public class ContactController {

    @Autowired
    PeopleService peopleService;
    
    @GetMapping("{id}")
    public PersonDto getPerson(@PathVariable(name="id") Long personId) {


        var result = peopleService.getPerson(personId);

        return result;
    }

    // @GetMapping("{id}")
    // public PersonDto getPerson(@PathVariable(name="id") UUID personId) {


    //     var result = peopleService.getPerson(personId);

    //     return result;
    // }

    @PostMapping
    public PersonEntity addPerson(@RequestBody PersonEntity person) {
        
        return peopleService.addPerson(person);
    }
    

}
