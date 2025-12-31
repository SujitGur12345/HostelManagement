package com.hostelmanagement.system.service;

import com.hostelmanagement.system.entity.Organization;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrganizationService {

  Organization saveOrganization(Organization organization);
  Organization getOrganizationByID(int id);
  void deleteOrganization(int id);
  List<Organization> getAllOrganization();

}
