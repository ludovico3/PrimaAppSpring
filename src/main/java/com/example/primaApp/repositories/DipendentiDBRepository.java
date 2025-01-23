package com.example.primaApp.repositories;

import com.example.primaApp.entity.Dipendente;
import com.example.primaApp.entity.Professori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DipendentiDBRepository extends JpaRepository<Dipendente,Integer> {
  List<Dipendente> findAll();
  List<Dipendente> findBySettore(String settore);
}
