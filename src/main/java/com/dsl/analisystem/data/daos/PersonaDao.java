package com.dsl.analisystem.data.daos;

import com.dsl.analisystem.data.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaDao extends JpaRepository<PersonEntity,Long> {
    List<PersonEntity> findAll();
}
