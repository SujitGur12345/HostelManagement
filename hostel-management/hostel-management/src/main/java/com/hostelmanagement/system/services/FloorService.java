package com.hostelmanagement.system.services;

import com.hostelmanagement.system.entity.Floor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FloorService {

    //Create
    void save(Floor floor);

    //Read
    List<Floor> findAll();

    //Read-BY-ID
    Floor FloorById(int id);

    //Update

    //Delete

}
