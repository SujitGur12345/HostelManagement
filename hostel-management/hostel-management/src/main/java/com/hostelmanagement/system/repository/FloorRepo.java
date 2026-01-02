package com.hostelmanagement.system.repository;

import com.hostelmanagement.system.entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepo extends JpaRepository<Floor, Integer> {
}
