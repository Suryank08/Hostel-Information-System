package com.example.hostelinformationsystem.controller;

import com.example.hostelinformationsystem.entity.Student;
import com.example.hostelinformationsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    StudentService studentService;
@Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
    @GetMapping("/")
    public String addStudent(Model model){
        model.addAttribute("student",new Student());
        return "form";
    }
    @PostMapping("/processStudentForm")
    public String processStudentForm(Model model, @ModelAttribute("student") Student student){
        studentService.add(student);
        return "findForm";
    }
    @GetMapping("/findForm")
    public String findForm(){
        return "findForm";
    }

    @GetMapping("/findStudentForm")
    public String getStudentDetails(@RequestParam("studentRollNo") String studentRollNo, Model model) {
    if(studentService.findStudentByRollNumber(studentRollNo)!=null){
        model.addAttribute("searchedStudent", studentService.findStudentByRollNumber(studentRollNo));
        return "found-student";
    }
    else{
        System.out.println("Student not found");
        return "error";
    }

    }
}
