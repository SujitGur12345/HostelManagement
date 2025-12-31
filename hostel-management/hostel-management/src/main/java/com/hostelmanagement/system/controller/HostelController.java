package com.hostelmanagement.system.controller;


import com.hostelmanagement.system.entity.Hostel;
import com.hostelmanagement.system.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("HM/hostel")
public class HostelController {


    @Autowired
    HostelService hostelService;


    @PostMapping
   public ResponseEntity createHostel(@RequestBody Hostel hostel) {

         hostelService.saveHostel(hostel);
        return new ResponseEntity(HttpStatus.CREATED);

    }

@GetMapping
    public ResponseEntity  getAllHostels(){

    List<Hostel> hostels = hostelService.getAllHostels();
        return new ResponseEntity(HttpStatus.OK);

}

@GetMapping("/{id}")

    public ResponseEntity  getHostelById(@PathVariable   int id){

         hostelService.getHostelById(id);
         return new ResponseEntity(HttpStatus.OK);

}

@DeleteMapping("/{id}")

    public ResponseEntity deleteHostel(@PathVariable int id){

        hostelService.deleteHostel( id);

        return new ResponseEntity(HttpStatus.OK);
}

}



