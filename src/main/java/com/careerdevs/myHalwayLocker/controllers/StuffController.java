package com.careerdevs.myHalwayLocker.controllers;


import com.careerdevs.myHalwayLocker.models.Stuff;
import com.careerdevs.myHalwayLocker.repositories.StuffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/stuff")
public class StuffController {

    @Autowired
    private StuffRepository repository;

    @GetMapping
    public ResponseEntity<Iterable<Stuff>> getAll() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Stuff> createStuff(@RequestBody Stuff newStuff) {
        System.out.println(newStuff.getStudent().getId());
        return new ResponseEntity<>(repository.save(newStuff), HttpStatus.CREATED);
    }
}
