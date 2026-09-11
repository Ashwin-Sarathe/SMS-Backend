package com.example.sms.controller;

import com.example.sms.model.Student;
import com.example.sms.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("student")
public class StudentController {
    StudentService studentService;
    StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id){
        studentService.deleteStudentById(id);
    }
}
