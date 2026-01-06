package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.BuildingRequestDTO;
import com.hostelmanagement.system.DTO.BuildingResponseDTO;

import java.util.List;

public interface BuildingService {

    // CREATE
    void saveBuilding(BuildingRequestDTO dto);

    // READ BY ID
    BuildingResponseDTO buildingById(int id);

    // READ ALL
    List<BuildingResponseDTO> findAll();

    // DELETE
    void deleteBuilding(int id);
}
