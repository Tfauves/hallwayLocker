package com.careerdevs.myHalwayLocker.controllers;

import com.careerdevs.myHalwayLocker.models.student.Student;
import com.careerdevs.myHalwayLocker.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public @ResponseBody List<Student> getAllStudents() {
        return repository.findAll();
    }

    @GetMapping("/cohort/{cohort}")
    public ResponseEntity<List<Student>> getByCohort(@PathVariable Integer cohort) {
        return new ResponseEntity<>(repository.findStudentsByCohort(cohort, Sort.by("firstName")), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public @ResponseBody Student findById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student newStudent) {
        return new ResponseEntity<>(repository.save(newStudent), HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity<Student> createStudent(@RequestBody Student newStudent) {
////        System.out.println(newStudent.getLocker().getId());
//        return new ResponseEntity<>(repository.save(newStudent), HttpStatus.CREATED);
//    }

    @PutMapping("/{id}")
    public @ResponseBody Student updateStudent(@PathVariable Long id, @RequestBody Student updatedData) {
        Student student = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updatedData.getFirstName() != null) student.setFirstName(updatedData.getFirstName());
        if (updatedData.getLastName() != null) student.setLastName(updatedData.getLastName());
        if (updatedData.getCohort() != null) student.setCohort(updatedData.getCohort());

        return repository.save(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> destroyStudent(@PathVariable Long id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }

}


