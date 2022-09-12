package com.dsl.analisystem.data.mappers;

import com.dsl.analisystem.data.entities.ModalityEntity;
import com.dsl.analisystem.services.models.Modality;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ModalityMapper {
    @Mappings({
            @Mapping(target = "name", source ="nombre")
    })
    Modality toModality(ModalityEntity modalityEntity);
}
