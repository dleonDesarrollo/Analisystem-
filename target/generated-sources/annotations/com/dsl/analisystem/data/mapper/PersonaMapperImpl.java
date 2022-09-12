package com.dsl.analisystem.data.mapper;

import com.dsl.analisystem.controller.dto.ModalityDTO;
import com.dsl.analisystem.controller.dto.PersonDTO;
import com.dsl.analisystem.data.entity.ModalidadEntity;
import com.dsl.analisystem.data.entity.PersonaEntity;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-11T19:29:35-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2.1 (Eclipse Adoptium)"
)
@Component
public class PersonaMapperImpl implements PersonaMapper {

    @Override
    public PersonDTO toPersonDTO(PersonaEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        Long idPerson = null;
        Instant dateRegister = null;
        String documentId = null;
        String name = null;
        String firstName = null;
        String lastName = null;
        Boolean working = null;

        idPerson = personEntity.getId();
        dateRegister = personEntity.getFechaRegistro();
        documentId = personEntity.getRut();
        name = personEntity.getNombre();
        firstName = personEntity.getApPat();
        lastName = personEntity.getApMat();
        working = personEntity.getEmpleado();

        PersonDTO personDTO = new PersonDTO( idPerson, dateRegister, documentId, name, firstName, lastName, working );

        personDTO.setModality( modalidadEntityToModalityDTO( personEntity.getModalidad() ) );

        return personDTO;
    }

    @Override
    public List<PersonDTO> toPersonsDTO(List<PersonaEntity> personaEntities) {
        if ( personaEntities == null ) {
            return null;
        }

        List<PersonDTO> list = new ArrayList<PersonDTO>( personaEntities.size() );
        for ( PersonaEntity personaEntity : personaEntities ) {
            list.add( toPersonDTO( personaEntity ) );
        }

        return list;
    }

    protected ModalityDTO modalidadEntityToModalityDTO(ModalidadEntity modalidadEntity) {
        if ( modalidadEntity == null ) {
            return null;
        }

        String nameModality = null;

        nameModality = modalidadEntity.getNombre();

        Short idModality = null;

        ModalityDTO modalityDTO = new ModalityDTO( idModality, nameModality );

        return modalityDTO;
    }
}
