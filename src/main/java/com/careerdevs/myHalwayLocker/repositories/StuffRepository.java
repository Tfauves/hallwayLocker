package com.careerdevs.myHalwayLocker.repositories;

import com.careerdevs.myHalwayLocker.models.Stuff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuffRepository extends JpaRepository<Stuff, Long> {
}
