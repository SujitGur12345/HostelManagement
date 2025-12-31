package com.hostelmanagement.system.service.impl;

import com.hostelmanagement.system.entity.Bed;
import com.hostelmanagement.system.repository.BedRepository;
import com.hostelmanagement.system.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService {

    @Autowired
    private BedRepository bedRepository;


    @Override
    public Bed addBed(Bed bed) {
        return bedRepository.save(bed);
    }

    @Override
    public List<Bed> getAllBeds() {
        return bedRepository.findAll();
    }

    @Override
    public Bed getBedById(int id) {
        return bedRepository.findById(id).orElse(null);
    }

    @Override
    public Bed updateBed(int id, Bed bed) {
        return bedRepository.save(bed);
    }

    @Override
    public void deleteBed(int id) {
        bedRepository.deleteById(id);
    }
}
