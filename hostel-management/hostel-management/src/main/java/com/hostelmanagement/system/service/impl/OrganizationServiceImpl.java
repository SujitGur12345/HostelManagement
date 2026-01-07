package com.hostelmanagement.system.service.impl;

import com.hostelmanagement.system.DTO.OrganizationRequestDTO;
import com.hostelmanagement.system.DTO.OrganizationResponseDTO;
import com.hostelmanagement.system.entity.Organization;
import com.hostelmanagement.system.repository.OrganizationRepo;
import com.hostelmanagement.system.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepo organizationRepo;


    @Override
    public Organization saveOrganization(OrganizationRequestDTO organizationdto) {

        Organization organization = new Organization();

        organization.setOrgName(organizationdto.getOrgName());
        organization.setType(organizationdto.getType());
        organization.setEmail(organizationdto.getEmail());
        organization.setWebsite(organizationdto.getWebsite());
        organization.setContactNo(organizationdto.getContactNo());

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
    public List<OrganizationResponseDTO> getAllOrganization()
    {
        List<Organization> organizations = organizationRepo.findAll();
        List<OrganizationResponseDTO> organizationResponseDTOS = new ArrayList<>();
        for(Organization organization: organizations){
            OrganizationResponseDTO organizationResponseDTO =new OrganizationResponseDTO();

            organizationResponseDTO.setOrgName(organization.getOrgName());
            organizationResponseDTO.setType(organization.getType());
            organizationResponseDTO.setWebsite(organization.getWebsite());

            organizationResponseDTOS.add(organizationResponseDTO);

        }

       // return organizationRepo.findAll();
        return organizationResponseDTOS;

    }
}
