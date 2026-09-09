package com.example.sms.service;

import com.example.sms.model.Course;
import com.example.sms.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    CourseRepository courseRepository;
    CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }

    public void createCourse(Course course){
        String courseCode = course.getCode();
        if(!courseRepository.existsByCode(courseCode)){
            courseRepository.save(course);
        }
    }
    public Optional<Course> getCourseById(String id){
        return courseRepository.findById(id);
    }
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public void deleteCourseById(String id){
        if(courseRepository.existsById(id)){
            courseRepository.deleteById(id);
        }
    }
}
