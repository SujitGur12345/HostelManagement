package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.FloorRequestDTO;
import com.hostelmanagement.system.DTO.FloorResponseDTO;
import com.hostelmanagement.system.entity.Floor;
import com.hostelmanagement.system.repository.FloorRepo;
import com.hostelmanagement.system.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<FloorResponseDTO> findAll() {

        //Get all Floor into Floor List
        List<Floor> floors = floorRepo.findAll();

        //Add in FLoorResponseList and Pass
        List<FloorResponseDTO> floorResponseDTOS = new ArrayList<>();

        for (Floor floor : floors) {
            FloorResponseDTO floorResponseDTO = new FloorResponseDTO();
         //   floorResponseDTO.setFloorNo(floor.getFloorNo());
            floorResponseDTO.setFloorName(floor.getFloorName());

            floorResponseDTOS.add(floorResponseDTO);
        }

        //Floor
        //return floorRepo.findAll();

       // FloorResponseDTO
        return floorResponseDTOS;
    }

    @Override
    public Floor FloorById(int id) {
        return floorRepo.findById(id).get();
    }
}
