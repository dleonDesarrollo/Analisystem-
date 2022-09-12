package com.dsl.analisystem.data.mapper;

import com.dsl.analisystem.controller.dto.ModalityDTO;
import com.dsl.analisystem.data.entity.ModalidadEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-11T19:29:34-0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2.1 (Eclipse Adoptium)"
)
@Component
public class ModalidadMapperImpl implements ModalidadMapper {

    @Override
    public ModalityDTO toModalityDto(ModalidadEntity modalidadEntity) {
        if ( modalidadEntity == null ) {
            return null;
        }

        Short idModality = null;
        String nameModality = null;

        idModality = modalidadEntity.getId();
        nameModality = modalidadEntity.getNombre();

        ModalityDTO modalityDTO = new ModalityDTO( idModality, nameModality );

        return modalityDTO;
    }
}
