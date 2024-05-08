package com.example.hostelinformationsystem.service;

import com.example.hostelinformationsystem.dao.StudentDao;
import com.example.hostelinformationsystem.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    StudentDao studentDao;
    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Transactional
    public Student add(Student student){
        return studentDao.save(student);
    };
    public Student findStudentByRollNumber(String rollNumber){
        return studentDao.findStudentByRollNumber(rollNumber);

    };


}
