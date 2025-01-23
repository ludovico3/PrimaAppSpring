package com.example.primaApp.services;

import com.example.primaApp.entity.Professori;
import com.example.primaApp.repositories.ProfessoriDBRepository;
import com.example.primaApp.repositories.ProfessoriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessoriService {

    private final ProfessoriDBRepository repository;

    public List<Professori> findAllProfessori() {
        return repository.findAll();
    }

    public Professori findProfessoriByMateria(String materia) {
      return repository.findByMateria(materia);
    }

    public Professori save(Professori p) {
        return repository.save(p);
    }




}
