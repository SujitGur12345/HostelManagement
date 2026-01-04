package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.RoomRequestDTO;
import com.hostelmanagement.system.DTO.RoomResponseDTO;
import com.hostelmanagement.system.entity.Room;
import com.hostelmanagement.system.repository.RoomRepository;
import com.hostelmanagement.system.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;



    @Override
    public void saveRoom(RoomRequestDTO roomdto) {


        Room room =new Room();
        room.setRoomNo(roomdto.getRoomNo());

        room.setType(roomdto.getType());

         roomRepository.save(room);

    }

    @Override
    public List<RoomResponseDTO> getAllRooms() {
      List<Room> rooms =roomRepository.findAll();
      List<RoomResponseDTO> list = new ArrayList<>();


      for (Room room : rooms){

          RoomResponseDTO dto = new RoomResponseDTO();
          dto.setRoomNo(room.getRoomNo());
       //   dto.setType(room.getType());
          list.add(dto);


      }

       return list;
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

//RoomServiceImpl
//Room