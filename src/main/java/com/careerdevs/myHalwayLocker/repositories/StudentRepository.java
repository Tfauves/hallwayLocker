package com.careerdevs.myHalwayLocker.repositories;

import com.careerdevs.myHalwayLocker.models.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentsByCohort(Integer cohort, Sort sort);

}
