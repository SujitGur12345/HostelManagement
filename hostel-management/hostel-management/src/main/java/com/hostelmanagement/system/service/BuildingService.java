package com.hostelmanagement.system.service;

import java.util.List;

import com.hostelmanagement.system.DTO.BuildingRequestDTO;
import com.hostelmanagement.system.entity.Building;



public interface BuildingService {

    void saveBuilding(BuildingRequestDTO dto);

    Building getBuilding(int id);

    List<Building> getAllBuildings();

    void deleteBuilding(int id);
}

