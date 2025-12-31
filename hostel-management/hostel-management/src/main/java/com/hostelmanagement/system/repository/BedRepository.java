package com.hostelmanagement.system.repository;

import com.hostelmanagement.system.entity.Bed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BedRepository extends JpaRepository<Bed, Integer> {
}
