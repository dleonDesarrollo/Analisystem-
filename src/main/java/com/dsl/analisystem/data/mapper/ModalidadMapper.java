package com.dsl.analisystem.data.mapper;

import com.dsl.analisystem.controller.dto.ModalityDTO;
import com.dsl.analisystem.data.entity.ModalidadEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ModalidadMapper {
    @Mappings({
            @Mapping(target = "idModality", source ="id"),
            @Mapping(target = "nameModality", source ="nombre")
    })
    ModalityDTO toModalityDto(ModalidadEntity modalidadEntity);
}
