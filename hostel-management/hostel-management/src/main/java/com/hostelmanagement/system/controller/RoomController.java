package com.hostelmanagement.system.controller;

import com.hostelmanagement.system.entity.Room;
import com.hostelmanagement.system.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("HM/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping
    public ResponseEntity createRoom(@RequestBody Room room){

      roomService.saveRoom(room);
       return new ResponseEntity<>( HttpStatus.CREATED);
    }

   @GetMapping
    public ResponseEntity getAllRooms(){


   List<Room> rooms = roomService.getAllRooms();

        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity getRoomById(@PathVariable int id){

        Room  room = roomService.getRoomsById(id);

        return new ResponseEntity<>( HttpStatus.OK);

    }

    @DeleteMapping
   public ResponseEntity deleteRoom(@PathVariable int id){

        roomService.deleteRoom(id);

        return new  ResponseEntity<>(HttpStatus.OK);

   }


}
