package com.careerdevs.myHalwayLocker.controllers;



import com.careerdevs.myHalwayLocker.models.Student;
import com.careerdevs.myHalwayLocker.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public @ResponseBody List<Student> getAllStudents() {
        return repository.findAll();
    }


}
