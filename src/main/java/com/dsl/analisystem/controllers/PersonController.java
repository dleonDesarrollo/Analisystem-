package com.dsl.analisystem.controllers;

import com.dsl.analisystem.controllers.dtos.PersonDTO;
import com.dsl.analisystem.controllers.mappers.PersonDtoMapper;
import com.dsl.analisystem.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@RequestMapping("/view-general")
public class PersonController {
    private static final String VIEW_LIST_PERSON = "/listPersonView";

    private final PersonService personaServiceImpl;
    private final PersonDtoMapper personDtoMapper;

    @GetMapping(VIEW_LIST_PERSON)
    public String callListPersonView(Model model){
        List<PersonDTO> personas = personaServiceImpl.findAll().stream()
                .map(personDtoMapper::toPersonDTO)
                .collect(Collectors.toList());

        model.addAttribute("personas", personas);
        return VIEW_LIST_PERSON;
    }
}