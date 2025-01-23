package com.example.primaApp.repositories;

import com.example.primaApp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDBRepository extends JpaRepository<Student,Integer> {

  List<Student> findAll();
  //* Incorpora il metodo presente già nel repository //* void save(Student student);
  Student findByMatricola(int matricola);







}
