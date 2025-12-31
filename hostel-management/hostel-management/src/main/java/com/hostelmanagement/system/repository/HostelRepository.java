package com.hostelmanagement.system.repository;

import com.hostelmanagement.system.entity.Hostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HostelRepository extends JpaRepository <Hostel, Integer>{
}
