package com.example.primaApp.repositories;

import com.example.primaApp.entity.Professori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessoriDBRepository extends JpaRepository<Professori,Integer> {
  List<Professori> findAll();
  Professori findByMateria(String materia);
}
