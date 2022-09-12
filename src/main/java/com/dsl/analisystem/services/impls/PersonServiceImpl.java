package com.dsl.analisystem.services.impls;

import com.dsl.analisystem.data.repositories.PersonRepository;
import com.dsl.analisystem.services.PersonService;
import com.dsl.analisystem.services.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository PersonRepository;

    public List<Person> findAll() {
        return PersonRepository.findAll();
    }

}
