package com.example.sms.repository;

import com.example.sms.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
    boolean existsByCode(String code);
}
