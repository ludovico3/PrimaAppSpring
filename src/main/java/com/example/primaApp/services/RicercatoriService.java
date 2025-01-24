package com.example.primaApp.services;

import com.example.primaApp.entity.Ricercatori;
import com.example.primaApp.repositories.RicercatoriDBRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RicercatoriService {
  private final RicercatoriDBRepository repository;

  public List<Ricercatori> findAllRicercatori() {
    return repository.findAll();
  }

  public Ricercatori save(Ricercatori r) {
    return repository.save(r);
  }

  public Ricercatori findRicercatoriByMateria(String materia) {
    return repository.findByMateria(materia);
  }
}
