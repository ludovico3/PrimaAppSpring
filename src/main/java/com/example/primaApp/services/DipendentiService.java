package com.example.primaApp.services;

import com.example.primaApp.entity.Dipendente;
import com.example.primaApp.repositories.DipendentiDBRepository;
import com.example.primaApp.repositories.DipendentiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DipendentiService {
    private final DipendentiDBRepository repository;




    public List<Dipendente> findAllDipendente() {
        return repository.findAll();
    }

    public List<Dipendente> findDipendenteBySettore(String settore) {
        return repository.findBySettore(settore);
    }

    public Dipendente save(Dipendente d) {
        return repository.save(d);
    }
    












}
