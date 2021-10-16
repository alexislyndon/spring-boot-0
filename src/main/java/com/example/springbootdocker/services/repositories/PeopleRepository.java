package com.example.springbootdocker.services.repositories;


import java.util.Optional;
import java.util.UUID;

import com.example.springbootdocker.model.entities.PersonEntity;

import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<PersonEntity, Long> {
    Optional<PersonEntity> findByPid(UUID pid);
}
