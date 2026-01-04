package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.RoomRequestDTO;
import com.hostelmanagement.system.DTO.RoomResponseDTO;
import com.hostelmanagement.system.entity.Room;

import java.util.List;

public interface RoomService {


    List<RoomResponseDTO>getAllRooms();

  Room getRoomsById(int id);



    void deleteRoom(int id);


    void saveRoom(RoomRequestDTO room);
}
//RoomSErvice