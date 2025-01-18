package com.example.primaApp.services;

import com.example.primaApp.entity.Student;
import com.example.primaApp.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }


    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    public Student save(Student s) {
        return repository.save(s);
    }

    public Student findStudentByMatricola(int matricola) {
        return repository.findStudentByMatricola(matricola);
    }
}
