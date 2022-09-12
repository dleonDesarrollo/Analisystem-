package com.dsl.analisystem.controllers.mappers;

import com.dsl.analisystem.controllers.dtos.ModalityDTO;
import com.dsl.analisystem.controllers.dtos.PersonDTO;
import com.dsl.analisystem.services.models.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ModalityDTO.class})
public interface PersonDtoMapper {
        @Mappings({
                @Mapping(target = "id", source = "id"),
                @Mapping(target = "dateRegister", source = "dateRegister"),
                @Mapping(target = "documentId", source = "documentId"),
                @Mapping(target = "name", source = "name"),
                @Mapping(target = "firstName", source = "firstName"),
                @Mapping(target = "lastName", source = "lastName"),
                @Mapping(target = "working", source = "working"),
                @Mapping(target = "modality.name", source = "modality.name")
        })
        PersonDTO toPersonDTO(Person person);
        List<PersonDTO> toPersonsDTO(List<Person> persons);
}
