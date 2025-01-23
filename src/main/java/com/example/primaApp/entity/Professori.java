package com.example.primaApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Professori {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String cognome;

    private String materia;
}
