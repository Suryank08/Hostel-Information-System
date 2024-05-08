package com.example.hostelinformationsystem.service;

import com.example.hostelinformationsystem.entity.Student;

public interface StudentService {
    public Student add(Student student);
    public Student findStudentByRollNumber(String rollNumber);
}
