package com.hostelmanagement.system.repository;


import com.hostelmanagement.system.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepo extends JpaRepository<Organization, Integer> {
}
