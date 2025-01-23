package com.example.primaApp.services;

import com.example.primaApp.entity.Dipendente;
import com.example.primaApp.repositories.DipendentiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendentiService {
    private final DipendentiRepository repository;

    public DipendentiService(DipendentiRepository repository) {
        this.repository = repository;
    }


    public List<Dipendente> findAllDipendente() {
        return repository.findAllDIPENDENTI();
    }

    public Dipendente findDipendenteBySettore(String settore) {
        return repository.findDipendenteBySettore(settore);
    }

    public Dipendente save(Dipendente d) {
        return repository.save(d);
    }
    












}
