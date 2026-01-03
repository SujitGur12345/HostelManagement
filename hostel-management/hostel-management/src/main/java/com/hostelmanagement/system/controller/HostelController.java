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
        return new ResponseEntity<>("Hostel created Successfully",HttpStatus.CREATED);

    }

@GetMapping
    public ResponseEntity<List<Hostel>> getAllHostels(){

    List<Hostel> hostels = hostelService.getAllHostels();
        return new ResponseEntity<>(hostels,HttpStatus.OK);

}

@GetMapping("/{id}")

    public ResponseEntity<Hostel>  getHostelById(@PathVariable   int id){

        Hostel hostel = hostelService.getHostelById(id);

    return new ResponseEntity<>(hostel,HttpStatus.OK);

}

@DeleteMapping("/{id}")

    public ResponseEntity deleteHostel(@PathVariable int id){

        hostelService.deleteHostel( id);

        return new ResponseEntity<>("Hostel Deleted Successfully",HttpStatus.OK);
}

}



