package com.hostelmanagement.system.controller;

import com.hostelmanagement.system.DTO.BedRequestDTO;
import com.hostelmanagement.system.DTO.BedResponseDTO;
import com.hostelmanagement.system.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("HM/beds")
public class BedController {

    @Autowired
    private BedService bedService;

    @PostMapping
    public ResponseEntity addBed(@RequestBody BedRequestDTO bedDTO) {
        bedService.addBed(bedDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BedResponseDTO>> getAllBeds() {
        return new ResponseEntity<>(bedService.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<BedResponseDTO> getBedById(@PathVariable int id) {
        return new ResponseEntity<>(bedService.bedById(id), HttpStatus.OK);
    }
}
