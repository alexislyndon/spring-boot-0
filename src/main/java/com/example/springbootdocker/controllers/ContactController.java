package com.example.springbootdocker.controllers;

import com.example.springbootdocker.model.dto.PersonDto;
import com.example.springbootdocker.services.PeopleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    PeopleService peopleService;
    
    @GetMapping("{id}")
    public PersonDto getPerson(@PathVariable(name="id") Long personId) {


        var result = peopleService.getPerson(personId);

        return result;
    }
}
