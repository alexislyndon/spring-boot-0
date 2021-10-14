package com.example.springbootdocker.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.example.springbootdocker.model.dto.PersonDto;
import com.example.springbootdocker.model.entities.PersonEntity;
import com.example.springbootdocker.services.repositories.PeopleRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    PeopleRepository peopleRepository;

    @Autowired
    ModelMapper modelMapper;

    public Iterable<PersonDto> getpeople() {

        Iterable<PersonEntity> people = peopleRepository.findAll();

        List<PersonDto> result = new ArrayList<>();

        modelMapper.getConfiguration().setPreferNestedProperties(false);
        for (PersonEntity p : people) {
            // var dto = new PersonDto(p.getFirstname(), p.getLastname());

            var dto = modelMapper.map(p, PersonDto.class);

            result.add(dto);
        }

        return result;
    }

    public PersonDto getPerson(Long personId) {

        Optional<PersonEntity> p = peopleRepository.findById(personId);

        if (p.get() == null) {
            throw new NoSuchElementException("Person with id " + personId + "does not exist");
        }

        // modelMapper.addMappings(Source::getFirstName, Destination::setName);
        // modelMapper.typeMap.addMapping(src -> src.getCustomer().getAge(), PersonDto::setEmailaddresses);
        // modelMapper.typeMap(PersonEntity.class, PersonDto.class).addMapping(src -> src.getEmailaddresses(), PersonDto::setEmailaddresses);
        var dto = modelMapper.map(p.get(), PersonDto.class);


        return dto;
    }

}
