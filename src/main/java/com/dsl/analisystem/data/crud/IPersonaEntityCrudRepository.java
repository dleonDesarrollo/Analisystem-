package com.dsl.analisystem.data.crud;

import com.dsl.analisystem.data.entity.PersonaEntity;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaEntityCrudRepository extends CrudRepository<PersonaEntity,Long> {
}
