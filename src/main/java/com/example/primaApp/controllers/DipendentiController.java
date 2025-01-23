package com.example.primaApp.controllers;

import com.example.primaApp.entity.Dipendente;
import com.example.primaApp.services.DipendentiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dipendenti")
public class DipendentiController {
  private final DipendentiService service;

  public DipendentiController(DipendentiService service) {
      this.service = service;
  }

  @GetMapping("/findAllDipendente")
  public List<Dipendente> findAllDipendente() {
    return service.findAllDipendente();
  }

  @GetMapping("/findDipendenteBySettore/{settore}")
  public List<Dipendente> findDipendenteBySettore(@PathVariable String settore) {
    return service.findDipendenteBySettore(settore);
  }

  @PostMapping("/save")
  public Dipendente save(@RequestBody Dipendente d) {
    return service.save(d);
  }
 }
