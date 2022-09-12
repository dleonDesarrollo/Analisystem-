package com.dsl.analisystem.data.repositories;

import com.dsl.analisystem.data.daos.PersonaDao;
import com.dsl.analisystem.data.mappers.PersonMapper;
import com.dsl.analisystem.services.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

    private final PersonaDao personaDao;
    private final PersonMapper personMapper;

    public List<Person> findAll() {
        return personaDao.findAll().stream()
                .map(personMapper::toPerson)
                .collect(Collectors.toList());
    }

}
