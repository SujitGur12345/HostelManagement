package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.FloorRequestDTO;
import com.hostelmanagement.system.entity.Floor;
import com.hostelmanagement.system.repository.FloorRepo;
import com.hostelmanagement.system.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorServiceImpl  implements FloorService {

    @Autowired
     FloorRepo floorRepo;

    @Override
    public void save(FloorRequestDTO floordto) {

        //But we are Passing  FloorRequestDTO
        //So we have to Convert it to Floor Using Setter and Getter


        Floor fl = new Floor();
        fl.setFloorName(floordto.getFloorName());
        fl.setFloorNo(floordto.getFloorNo());


        floorRepo.save(fl); //FloorRepo Needs Floor as Entity

    }

    @Override
    public List<Floor> findAll() {

        //Floor
        return floorRepo.findAll();
    }

    @Override
    public Floor FloorById(int id) {
        return floorRepo.findById(id).get();
    }
}
