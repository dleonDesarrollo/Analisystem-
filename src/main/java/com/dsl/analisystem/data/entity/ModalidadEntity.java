package com.dsl.analisystem.data.entity;

import lombok.*;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "modalidad")
public class ModalidadEntity {
    @Id
    @Column(name = "id_modalidad", nullable = false)
    private Short id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
}