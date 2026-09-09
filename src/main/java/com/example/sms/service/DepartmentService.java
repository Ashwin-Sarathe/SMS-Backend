package com.example.sms.service;

import com.example.sms.model.Department;
import com.example.sms.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    DepartmentRepository departmentRepository;
    DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;
    }

    public void createDepartment(Department department){
        departmentRepository.save(department);
    }
    public Optional<Department> getDepartmentById(String id){
        return departmentRepository.findById(id);
    }
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
    public void deleteDepartmentById(String id){
        if(departmentRepository.existsById(id))
            departmentRepository.deleteById(id);
    }
}
