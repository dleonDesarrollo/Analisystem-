package com.dsl.analisystem.data.mapper;

import com.dsl.analisystem.controller.dto.ModalityDTO;
import com.dsl.analisystem.controller.dto.PersonDTO;
import com.dsl.analisystem.data.entity.PersonaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import java.util.List;

@Mapper(componentModel = "spring", uses = {ModalityDTO.class})
public interface PersonaMapper {
    @Mappings({
            @Mapping(target = "idPerson", source = "id"),
            @Mapping(target = "dateRegister", source = "fechaRegistro"),
            @Mapping(target = "documentId", source = "rut"),
            @Mapping(target = "name", source = "nombre"),
            @Mapping(target = "firstName", source = "apPat"),
            @Mapping(target = "lastName", source = "apMat"),
            @Mapping(target = "working", source = "empleado"),
            @Mapping(target = "modality.nameModality", source = "modalidad.nombre")
    })
    PersonDTO toPersonDTO(PersonaEntity personEntity);
    List<PersonDTO> toPersonsDTO(List<PersonaEntity> personaEntities);

//    @InheritInverseConfiguration
//    PersonaEntity toPersonaEntity(PersonDTO personDTO);
}
