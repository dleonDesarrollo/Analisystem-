package com.dsl.analisystem.controllers.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class PersonDTO implements Serializable {
    private final Long id;
    private final Instant dateRegister;
    private final String documentId;
    private final String name;
    private final String firstName;
    private final String lastName;
    private final boolean working;
    private ModalityDTO modality;
}
