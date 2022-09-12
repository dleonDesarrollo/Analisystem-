package com.dsl.analisystem.data.mappers;

import com.dsl.analisystem.data.entities.PersonEntity;
import com.dsl.analisystem.services.models.Modality;
import com.dsl.analisystem.services.models.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {Modality.class})
public interface PersonMapper {
    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "dateRegister", source = "fechaRegistro"),
            @Mapping(target = "documentId", source = "rut"),
            @Mapping(target = "name", source = "nombre"),
            @Mapping(target = "firstName", source = "primerApellido"),
            @Mapping(target = "lastName", source = "segundoApellido"),
            @Mapping(target = "working", source = "empleado"),
            @Mapping(target = "modality.name", source = "modalidad.nombre")
    })
    Person toPerson(PersonEntity personEntity);
    List<Person> toPersonas(List<PersonEntity> personaEntities);
}
