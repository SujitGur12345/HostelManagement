package com.hostelmanagement.system.service;

import java.util.List;
import com.hostelmanagement.system.entity.Building;



public interface BuildingService {

    void saveBuilding(Building building);
    Building getBuilding(int id);
    void deleteBuilding(int id);
    List<Building> getAllBuildings();
}
