package com.hostelmanagement.system.service.impl;

import java.util.List;

import com.hostelmanagement.system.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostelmanagement.system.entity.Building;
import com.hostelmanagement.system.repository.BuildingRepository;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository repo;

    @Override
    public void saveBuilding(Building building) {
        repo.save(building);
    }

    @Override
    public Building getBuilding(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteBuilding(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Building> getAllBuildings() {
        return repo.findAll();
    }
}