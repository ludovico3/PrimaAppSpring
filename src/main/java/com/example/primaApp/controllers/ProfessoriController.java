package com.example.primaApp.controllers;

import com.example.primaApp.entity.Professori;
import com.example.primaApp.services.ProfessoriService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professori")
//http:localhost:8081/api/professori/findAllProfessori
//http:localhost:8080/api/professori/save
public class ProfessoriController {

    private final ProfessoriService service;


    public ProfessoriController(ProfessoriService service) {
        this.service = service;
    }

    @GetMapping("/findAllProfessori")
    public List<Professori> findAllProfessori() {
        return service.findAllProfessori();
    }

    @GetMapping("/findProfessoriByMateria/{materia}")
    public Professori findProfessoriByMateria(@PathVariable String materia) {
      return service.findProfessoriByMateria(materia);
    }

    @PostMapping("/save")
    public Professori save(@RequestBody Professori p) {
        return service.save(p);
    }



}
