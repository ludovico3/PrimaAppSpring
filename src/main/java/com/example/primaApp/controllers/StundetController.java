package com.example.primaApp.controllers;

import com.example.primaApp.entity.Student;
import com.example.primaApp.repositories.StudentRepository;
import com.example.primaApp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students") //http:localhost:8080/api/students
//http:localhost:8081/api/students/findAllStudents
//http:localhost:8080/api/students/save
//http:localhost:8081/api/students/findByMatricola/3
public class StundetController {

    private final StudentService service;

    public StundetController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/findAllStudents")
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("/save")
    public Student save(@RequestBody Student s) {
      return service.save(s);
    }

    @GetMapping("/findByMatricola/{matricola}")
    public Student findStudentByMatricola(@PathVariable int matricola) {
       return service.findStudentByMatricola(matricola);
    }

}