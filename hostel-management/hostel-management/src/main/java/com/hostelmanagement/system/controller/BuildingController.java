package com.hostelmanagement.system.controller;

import com.hostelmanagement.system.DTO.BuildingRequestDTO;
import com.hostelmanagement.system.entity.Building;
import com.hostelmanagement.system.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("HM/building")
public class BuildingController {

    @Autowired
    private BuildingService service;

    @PostMapping
    public ResponseEntity addBuilding(@RequestBody BuildingRequestDTO dto) {
        service.saveBuilding(dto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Building> getBuilding(@PathVariable int id) {
        return new ResponseEntity(service.getBuilding(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Building>> getAllBuildings() {
        return new ResponseEntity(service.getAllBuildings(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteBuilding(@PathVariable int id) {
        service.deleteBuilding(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
