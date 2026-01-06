package com.hostelmanagement.system.controller;

import com.hostelmanagement.system.DTO.BuildingRequestDTO;
import com.hostelmanagement.system.DTO.BuildingResponseDTO;
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

    // CREATE
    @PostMapping
    public ResponseEntity addBuilding(@RequestBody BuildingRequestDTO dto) {
        service.saveBuilding(dto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    // GET BY ID
    @GetMapping("{id}")
    public ResponseEntity<BuildingResponseDTO> getBuilding(@PathVariable int id) {
        return new ResponseEntity<>(service.buildingById(id), HttpStatus.OK);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<BuildingResponseDTO>> getAllBuildings() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    // DELETE
    @DeleteMapping("{id}")
    public ResponseEntity deleteBuilding(@PathVariable int id) {
        service.deleteBuilding(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
