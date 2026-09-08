package com.example.sms.service;

import com.example.sms.model.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository studentRepository;
    StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public void createStudent(Student student){
        studentRepository.save(student);
    }
    public Optional<Student> getStudentById(String id){
        return studentRepository.getStudentById(id);
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public void deleteStudentById(String id){
        Optional<Student> optionalStudent = studentRepository.getStudentById(id);
        if(optionalStudent.isPresent()){
            studentRepository.delete(optionalStudent.get());
        }
    }
}
