package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.BedRequestDTO;
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

    // CREATE
    @Override
    public void addBed(BedRequestDTO bedDTO) {

        // DTO → ENTITY
        Bed bed = new Bed();
        bed.setBedNo(bedDTO.getBedNo());
        bed.setStatus(bedDTO.getStatus());
        bed.setPrice(bedDTO.getPrice());
        bed.setSharing(bedDTO.getSharing());
        bed.setDeposit(bedDTO.getDeposit());

        bedRepository.save(bed);
    }

    // READ ALL
    @Override
    public List<Bed> getAllBeds() {
        return bedRepository.findAll();
    }

    // READ BY ID
    @Override
    public Bed getBedById(int id) {
        return bedRepository.findById(id).orElse(null);
    }

    // UPDATE
    @Override
    public void updateBed(int id, Bed bed) {
        bed.setId(id);
        bedRepository.save(bed);
    }

    // DELETE
    @Override
    public void deleteBed(int id) {
        bedRepository.deleteById(id);
    }
}
