package com.hostelmanagement.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hostelmanagement.system.entity.Building;


public interface BuildingRepository
         extends JpaRepository<Building, Integer> {
}
