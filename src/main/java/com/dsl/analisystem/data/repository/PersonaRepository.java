package com.dsl.analisystem.data.repository;

import com.dsl.analisystem.controller.dto.PersonDTO;
import com.dsl.analisystem.controller.repository.IPersonDTORepository;
import com.dsl.analisystem.data.crud.IPersonaEntityCrudRepository;
import com.dsl.analisystem.data.entity.PersonaEntity;
import com.dsl.analisystem.data.mapper.PersonaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository implements IPersonDTORepository {

    private final IPersonaEntityCrudRepository crud;
    @Autowired
    private final PersonaMapper mapper;

    public PersonaRepository(IPersonaEntityCrudRepository crud, PersonaMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public List<PersonDTO> findAll() {
        return mapper.toPersonsDTO((List<PersonaEntity>) crud.findAll());}

    @Override
    public Optional<PersonDTO> findById(Long idPerson) {
        return Optional.empty();
    }

    @Override
    public PersonDTO save(PersonDTO personDTO) {
        return null;
    }

    @Override
    public void delete(Long idPerson) {
    }

}
