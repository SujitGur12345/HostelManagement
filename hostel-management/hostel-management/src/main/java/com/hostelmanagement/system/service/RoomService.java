package com.hostelmanagement.system.service;

import com.hostelmanagement.system.entity.Room;

import java.util.List;

public interface RoomService {




    Room saveRoom(Room room);


    List<Room>getAllRooms();

  Room getRoomsById(int id);



    void deleteRoom(int id);



}
