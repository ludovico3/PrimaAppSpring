package com.example.primaApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ricercatori {

  @Id
  @GeneratedValue
  private Integer id;
  private String nome;
  private String cognome;
  private String materia;
}
