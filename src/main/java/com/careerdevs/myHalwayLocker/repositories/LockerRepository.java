package com.careerdevs.myHalwayLocker.repositories;

import com.careerdevs.myHalwayLocker.models.locker.Locker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LockerRepository extends JpaRepository <Locker, Long> {



}
