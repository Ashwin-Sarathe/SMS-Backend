package com.example.sms.controller;

import com.example.sms.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("student")
public class StudentController {
    StudentService studentService;
    StudentController(StudentService studentService){
        this.studentService=studentService;
    }

}
