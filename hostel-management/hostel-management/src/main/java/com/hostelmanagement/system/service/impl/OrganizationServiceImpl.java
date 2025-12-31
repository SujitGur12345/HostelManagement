package com.hostelmanagement.system.service.impl;

import com.hostelmanagement.system.entity.Organization;
import com.hostelmanagement.system.repository.OrganizationRepo;
import com.hostelmanagement.system.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepo organizationRepo;


    @Override
    public Organization saveOrganization(Organization organization) {
        return organizationRepo.save(organization);
    }


    @Override
    public Organization getOrganizationByID(int id) {
        return organizationRepo.findById(id).get();
    }

    @Override
    public void deleteOrganization(int id) {
         organizationRepo.deleteById(id);

    }

    @Override
    public List<Organization> getAllOrganization() {
        return organizationRepo.findAll();
    }
}
