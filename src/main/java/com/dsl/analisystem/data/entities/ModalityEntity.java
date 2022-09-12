package com.dsl.analisystem.data.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "modalidad")
@Builder
public class ModalityEntity {
    @Id
    @Column(name = "id_modalidad", nullable = false)
    private Short id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
}