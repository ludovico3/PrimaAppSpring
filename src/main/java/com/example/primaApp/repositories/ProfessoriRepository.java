package com.example.primaApp.repositories;

import com.example.primaApp.entity.Professori;
import com.example.primaApp.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfessoriRepository {

    Professori p1 =  new Professori(1,"a","b","storia");
    Professori p2 =  new Professori(2,"c","d","geografia");
    Professori p3 =  new Professori(3,"e","f", "matematica");

    private List<Professori> PROFESSORI = new ArrayList<>();

    public ProfessoriRepository() {
        PROFESSORI.add(p1);
        PROFESSORI.add(p2);
        PROFESSORI.add(p3);
    }

    public List<Professori> findAllProfessori() { return PROFESSORI;}

    public Professori save(Professori p) {
        PROFESSORI.add(p);
        return p;
    }
}
