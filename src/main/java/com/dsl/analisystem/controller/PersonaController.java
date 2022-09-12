package com.dsl.analisystem.controller;

import com.dsl.analisystem.services.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class PersonaController {
    private final PersonaService service;

    @GetMapping
    public String callListPersonView(Model model){
        model.addAttribute("personas", service.findAll());
        return "view-general/listPersonView";
    }
}