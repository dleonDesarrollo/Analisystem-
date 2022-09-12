package com.dsl.analisystem.data.entity;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "persona")
public class PersonaEntity{
    @Id
    @Column(name = "id_persona", nullable = false)
    private Long id;

    @Column(name = "fecha_registro", nullable = false)
    private Instant fechaRegistro;

    @Column(name = "rut", nullable = false, length = 10)
    private String rut;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "ap_pat", nullable = false, length = 50)
    private String apPat;

    @Column(name = "ap_mat", nullable = false, length = 50)
    private String apMat;

    @Column(name = "empleado", nullable = false)
    private Boolean empleado = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_modalidad", nullable = false)
    private ModalidadEntity modalidad;
}