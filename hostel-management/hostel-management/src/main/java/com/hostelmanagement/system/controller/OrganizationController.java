package com.hostelmanagement.system.controller;


import com.hostelmanagement.system.entity.Organization;
import com.hostelmanagement.system.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("HM/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;


    @PostMapping()
    public ResponseEntity<String> addOrganization(@RequestBody Organization organization){
        organizationService.saveOrganization(organization);
        return new ResponseEntity<>("Organization added Successfully", HttpStatus.CREATED) ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getOrganizationByID(@PathVariable  int id){
        return new ResponseEntity<>( organizationService.getOrganizationByID(id),HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Organization>> getAllOrganization(){
        return  new ResponseEntity<>(organizationService.getAllOrganization(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrganizationByID(@PathVariable  int id){
        organizationService.deleteOrganization(id);
        return new ResponseEntity<>("Organization Deleted",HttpStatus.OK);
    }

}
