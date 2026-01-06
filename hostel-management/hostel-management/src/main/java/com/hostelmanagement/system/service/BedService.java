package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.BedRequestDTO;
import com.hostelmanagement.system.DTO.BedResponseDTO;

import java.util.List;

public interface BedService {

    void addBed(BedRequestDTO bedDTO);

    List<BedResponseDTO> findAll();

    BedResponseDTO bedById(int id);
}
