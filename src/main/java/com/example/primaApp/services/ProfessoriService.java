package com.example.primaApp.services;

import com.example.primaApp.entity.Professori;
import com.example.primaApp.repositories.ProfessoriRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessoriService {

    private final ProfessoriRepository repository;


    public ProfessoriService(ProfessoriRepository repository) {
        this.repository = repository;
    }

    public List<Professori> findAllProfessori() {
        return repository.findAllProfessori();
    }

    public Professori save(Professori p) {
        return repository.save(p);
    }
}
