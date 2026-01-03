package com.hostelmanagement.system.controller;

import com.hostelmanagement.system.DTO.BedRequestDTO;
import com.hostelmanagement.system.entity.Bed;
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

    // CREATE BED
    @PostMapping
    public ResponseEntity addBed(@RequestBody BedRequestDTO bedDTO) {

        bedService.addBed(bedDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    // GET ALL BEDS
    @GetMapping
    public ResponseEntity<List<Bed>> getAllBeds() {
        return new ResponseEntity(
                bedService.getAllBeds(),
                HttpStatus.OK
        );
    }

    // GET BED BY ID
    @GetMapping("{id}")
    public ResponseEntity<Bed> getBedById(@PathVariable int id) {
        return new ResponseEntity(
                bedService.getBedById(id),
                HttpStatus.OK
        );
    }

    // UPDATE BED
    @PutMapping("{id}")
    public ResponseEntity updateBed(@PathVariable int id, @RequestBody Bed bed) {
        bedService.updateBed(id, bed);
        return new ResponseEntity(HttpStatus.OK);
    }

    // DELETE BED
    @DeleteMapping("{id}")
    public ResponseEntity deleteBed(@PathVariable int id) {
        bedService.deleteBed(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}