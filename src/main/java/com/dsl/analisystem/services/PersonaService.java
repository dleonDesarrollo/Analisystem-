package com.dsl.analisystem.services;

import com.dsl.analisystem.controller.dto.PersonDTO;
import com.dsl.analisystem.controller.repository.IPersonDTORepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    private final IPersonDTORepository iPersonaRepository;

    public PersonaService(IPersonDTORepository iPersonaRepository) {
        this.iPersonaRepository = iPersonaRepository;
    }
    public List<PersonDTO> findAll() {
        return iPersonaRepository.findAll();
    }
}
