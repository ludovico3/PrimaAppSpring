package com.example.primaApp.controllers;

import com.example.primaApp.entity.Ricercatori;
import com.example.primaApp.services.RicercatoriService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ricercatori")//http:localhost:8080/api/ricercatori
//http:localhost:8081/api/ricercatori/findAllRicercatori
//http:localhost:8080/api/ricercatori/save
//http:localhost:8081/api/ricercatori/findByMateria/3
public class RicercatoriController {
  private final RicercatoriService service;

  public RicercatoriController(RicercatoriService service) {
    this.service = service;
  }

  @GetMapping("/findAllRicercatori")
  public List<Ricercatori> findAllRicercatori() {
    return service.findAllRicercatori();
  }

  @GetMapping("/findRicercatoriByMateria/{materia}")
  public Ricercatori findRicercatoriByMateria(@PathVariable String materia) {
    return service.findRicercatoriByMateria(materia);
  }

  @PostMapping("/save")
  public Ricercatori save(@RequestBody Ricercatori r) {
    return service.save(r);
  }
}





