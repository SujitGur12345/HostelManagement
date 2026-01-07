package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.OrganizationRequestDTO;
import com.hostelmanagement.system.DTO.OrganizationResponseDTO;
import com.hostelmanagement.system.entity.Organization;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrganizationService {

  Organization saveOrganization(OrganizationRequestDTO organization);
  Organization getOrganizationByID(int id);
  void deleteOrganization(int id);
  List<OrganizationResponseDTO > getAllOrganization();

}
