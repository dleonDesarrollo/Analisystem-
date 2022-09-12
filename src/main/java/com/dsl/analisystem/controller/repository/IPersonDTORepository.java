package com.dsl.analisystem.controller.repository;

import com.dsl.analisystem.controller.dto.PersonDTO;

import java.util.List;
import java.util.Optional;

public interface IPersonDTORepository {
    List<PersonDTO> findAll();

    Optional<PersonDTO> findById(Long idPerson);

    PersonDTO save(PersonDTO personDTO);

    void delete(Long idPerson);

}
