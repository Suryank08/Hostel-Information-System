package com.example.hostelinformationsystem.dao;

import com.example.hostelinformationsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {
    @Query("SELECT s FROM Student s WHERE s.rollNumber = :rollNumber")
    public Student findStudentByRollNumber(@Param("rollNumber") String rollNumber);

}
