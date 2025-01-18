package com.example.primaApp.repositories;


import com.example.primaApp.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    Student s1 =  new Student(1,"a","b",1);
    Student s2 =  new Student(2,"c","d",2);
    Student s3 =  new Student(3,"e","f", 3);

    private List<Student> STUDENTS = new ArrayList<>();

    public StudentRepository() {
        STUDENTS.add(s1);
        STUDENTS.add(s2);
        STUDENTS.add(s3);
    }

    public List<Student> findAllStudents() { return STUDENTS;}

    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }

    public Student findStudentByMatricola(int matricola) {
        Student s = new Student();
        for(Student stu : STUDENTS) {
            if (stu.getMatricola() == matricola){
                s = stu;
            }
        }
        return s;
    }
}
