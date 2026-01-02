package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.FloorRequestDTO;
import com.hostelmanagement.system.entity.Floor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FloorService {

    //Create
    void save(FloorRequestDTO floor);

    //Read
    List<Floor> findAll();

    //Read-BY-ID
    Floor FloorById(int id);

    //Update

    //Delete

}
