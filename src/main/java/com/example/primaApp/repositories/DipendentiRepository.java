package com.example.primaApp.repositories;

import com.example.primaApp.entity.Dipendente;
import com.example.primaApp.entity.Dipendente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DipendentiRepository {
    Dipendente d1 =  new Dipendente(1,"a","b","pulizia");
    Dipendente d2 =  new Dipendente(2,"c","d","ristorazione");
    Dipendente d3 =  new Dipendente(3,"e","f", "portineria");

    private List<Dipendente> DIPENDENTI = new ArrayList<>();

    public DipendentiRepository() {
        DIPENDENTI.add(d1);
        DIPENDENTI.add(d2);
        DIPENDENTI.add(d3);
    }

    public List<Dipendente> findAllDIPENDENTI() { return DIPENDENTI;}

    public Dipendente save(Dipendente s) {
        DIPENDENTI.add(s);
        return s;
    }

    public Dipendente findDipendenteBySettore(String settore) {
        Dipendente d = new Dipendente();
        for(Dipendente dip : DIPENDENTI) {
            if (dip.getSettore().equals(settore)){
                d = dip;
            }
        }
        return d;
    }













}
