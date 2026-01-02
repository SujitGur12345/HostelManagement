package com.hostelmanagement.system.controller;

import com.hostelmanagement.system.entity.Floor;
import com.hostelmanagement.system.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("HM/floor")    //1.   Prefix as HM/Entityname
public class FloorController {

    @Autowired
    FloorService floorService;

    //Create Floor
    @PostMapping()
    public ResponseEntity AddFloor(@RequestBody Floor floor){

        floorService.save(floor);
        return new ResponseEntity(HttpStatus.CREATED);
        //return  ResponseEntity.ok(HttpStatus.OK);     ----> 2. Method

    }

    //GetALL List
    @GetMapping()
    public ResponseEntity<List<Floor>> FindAll(){
        return new ResponseEntity(floorService.findAll(), HttpStatus.OK);
    }

    //GET By ID
    @GetMapping("{id}")
    public ResponseEntity<Floor> FindById(@PathVariable int id){
        return new ResponseEntity(floorService.FloorById(id), HttpStatus.OK);
    }

}
