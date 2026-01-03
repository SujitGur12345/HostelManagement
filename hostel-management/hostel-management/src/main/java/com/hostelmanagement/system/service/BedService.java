package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.BedRequestDTO;
import com.hostelmanagement.system.entity.Bed;

import java.util.List;

public interface BedService {

    // CREATE
    void addBed(BedRequestDTO bedDTO);

    // READ ALL
    List<Bed> getAllBeds();

    // READ BY ID
    Bed getBedById(int id);

    // UPDATE
    void updateBed(int id, Bed bed);

    // DELETE
    void deleteBed(int id);
}
