package com.example.primaApp.repositories;

import com.example.primaApp.entity.Ricercatori;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RicercatoriRepository {
  Ricercatori r1 = new Ricercatori(1, "a", "b", "matematica");
  Ricercatori r2 = new Ricercatori(2, "c", "d", "fisica");
  Ricercatori r3 = new Ricercatori(3, "e", "f", "scienze");

  private List<Ricercatori> RICERCATORI = new ArrayList<>();

  public RicercatoriRepository() {
    RICERCATORI.add(r1);
    RICERCATORI.add(r2);
    RICERCATORI.add(r3);
  }

  public List<Ricercatori> findAllRicercatori() {
    return RICERCATORI;
  }

  public Ricercatori save(Ricercatori r) {
    RICERCATORI.add(r);

    return r;
  }

  public Ricercatori findRicercatoreByMateria(String materia) {
    Ricercatori r = new Ricercatori();

    for (Ricercatori ric : RICERCATORI) {
      if (r.getMateria().equals(materia)) {
        r = ric;
      }
    }

    return r;
  }
}
