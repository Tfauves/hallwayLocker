package com.careerdevs.myHalwayLocker.repositories;

import com.careerdevs.myHalwayLocker.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
