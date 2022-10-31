package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository employeeRepository;
    @Override
    public List<Student> getAllEmployees() {
        return employeeRepository;
    }
}
