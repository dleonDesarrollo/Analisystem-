package com.dsl.analisystem.services.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private Long id;
    private Instant dateRegister;
    private String documentId;
    private String name;
    private String firstName;
    private String lastName;
    private boolean working;
    private Modality modality;
}
