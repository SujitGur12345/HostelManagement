package com.hostelmanagement.system.service;


import com.hostelmanagement.system.entity.Bed;

import java.util.List;

public interface BedService {

    Bed addBed(Bed bed);

    List<Bed> getAllBeds();

    Bed getBedById(int id);

    Bed updateBed(int id, Bed bed);

    void deleteBed(int id);
}
