package com.example.springbootdocker.services.repositories;

// import com.example.springbootdocker.model.dto.PersonDto;
import com.example.springbootdocker.model.entities.PersonEntity;

import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<PersonEntity, Long> {
}
