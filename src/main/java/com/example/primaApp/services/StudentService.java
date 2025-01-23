package com.example.primaApp.services;

import com.example.primaApp.entity.Student;
import com.example.primaApp.repositories.StudentDBRepository;
import com.example.primaApp.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentDBRepository repository;


    public List<Student> findAllStudents() {return repository.findAll();}

    public Student save(Student s) {
        return repository.save(s);
    }

    public Student findStudentByMatricola(int matricola) {
        return repository.findByMatricola(matricola);
    }
}
