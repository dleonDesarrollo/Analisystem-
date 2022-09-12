package com.dsl.analisystem.controller.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class PersonDTO implements Serializable {
    private final Long idPerson;
    private final Instant dateRegister;
    private final String documentId;
    private final String name;
    private final String firstName;
    private final String lastName;
    private final Boolean working;
    private ModalityDTO modality;
}
