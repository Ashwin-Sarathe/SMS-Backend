package com.example.sms.repository;

import com.example.sms.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> getStudentById(String id);
}
