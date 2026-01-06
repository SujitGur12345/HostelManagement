package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.BuildingRequestDTO;
import com.hostelmanagement.system.DTO.BuildingResponseDTO;
import com.hostelmanagement.system.entity.Building;
import com.hostelmanagement.system.repository.BuildingRepository;
import com.hostelmanagement.system.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository repo;

    // CREATE
    @Override
    public void saveBuilding(BuildingRequestDTO dto) {

        Building building = new Building();
        building.setName(dto.getName());
        building.setFloors(dto.getFloors());
        building.setWarden(dto.getWarden());

        repo.save(building);
    }

    // READ BY ID
    @Override
    public BuildingResponseDTO buildingById(int id) {

        Building building = repo.findById(id).get();

        BuildingResponseDTO dto = new BuildingResponseDTO();
        dto.setName(building.getName());
        dto.setWarden(building.getWarden());

        return dto;
    }

    // READ ALL
    @Override
    public List<BuildingResponseDTO> findAll() {

        List<Building> buildings = repo.findAll();
        List<BuildingResponseDTO> responseList = new ArrayList<>();

        for (Building building : buildings) {
            BuildingResponseDTO dto = new BuildingResponseDTO();
            dto.setName(building.getName());
            dto.setWarden(building.getWarden());
            responseList.add(dto);
        }

        return responseList;
    }

    // DELETE
    @Override
    public void deleteBuilding(int id) {
        repo.deleteById(id);
    }
}
