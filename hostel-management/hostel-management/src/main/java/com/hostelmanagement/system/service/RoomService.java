package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.Request.RoomRequestDTO;
import com.hostelmanagement.system.entity.Room;

import java.util.List;

public interface RoomService {



//create



    List<Room>getAllRooms();

  Room getRoomsById(int id);



    void deleteRoom(int id);


    void saveRoom(RoomRequestDTO room);
}
