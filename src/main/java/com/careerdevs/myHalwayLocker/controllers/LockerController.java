package com.careerdevs.myHalwayLocker.controllers;

import com.careerdevs.myHalwayLocker.models.Locker;
import com.careerdevs.myHalwayLocker.repositories.LockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/locker")
public class LockerController {

    @Autowired
    private LockerRepository repository;

    @GetMapping
    public @ResponseBody List<Locker> getAll() {
        return repository.findAll();
    }


    @GetMapping("/locker/{locker_id}")
    public @ResponseBody Locker getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Locker> createLocker(@RequestBody Locker newLocker) {
        return new ResponseEntity<>(repository.save(newLocker), HttpStatus.CREATED);
    }

}
