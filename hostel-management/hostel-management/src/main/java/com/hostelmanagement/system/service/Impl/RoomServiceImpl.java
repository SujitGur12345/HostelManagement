package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.entity.Room;
import com.hostelmanagement.system.repository.RoomRepository;
import com.hostelmanagement.system.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;


    @Override
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getRoomsById(int id) {
        return roomRepository.findById(id).get();
    }


    @Override
    public void deleteRoom(int id) {

        roomRepository.deleteById(id);
    }
}
