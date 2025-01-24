package com.example.primaApp.repositories;

import com.example.primaApp.entity.Ricercatori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RicercatoriDBRepository extends JpaRepository<Ricercatori,Integer>{
  List<Ricercatori> findAll();
  Ricercatori findByMateria(String materia);
}
