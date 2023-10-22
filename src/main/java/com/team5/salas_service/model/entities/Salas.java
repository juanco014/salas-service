package com.team5.salas_service.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //api
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="salas")
public class Salas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String salas;
    private String cantComputadores;
    private String cantmesas;
    private String estado;
}
