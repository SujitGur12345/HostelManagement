package com.hostelmanagement.system.services.FloorServiceImpl;

import com.hostelmanagement.system.entity.Floor;
import com.hostelmanagement.system.repository.FloorRepo;
import com.hostelmanagement.system.services.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorServiceImpl  implements FloorService {

    @Autowired
     FloorRepo floorRepo;

    @Override
    public void save(Floor floor) {
        floorRepo.save(floor);

    }

    @Override
    public List<Floor> findAll() {
        return floorRepo.findAll();
    }

    @Override
    public Floor FloorById(int id) {
        return floorRepo.findById(id).get();
    }
}
