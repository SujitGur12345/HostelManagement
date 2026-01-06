package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.BedRequestDTO;
import com.hostelmanagement.system.DTO.BedResponseDTO;
import com.hostelmanagement.system.entity.Bed;
import com.hostelmanagement.system.repository.BedRepository;
import com.hostelmanagement.system.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BedServiceImpl implements BedService {

    @Autowired
    private BedRepository bedRepository;

    @Override
    public void addBed(BedRequestDTO bedDTO) {
        Bed bed = new Bed();
        bed.setBedNo(bedDTO.getBedNo());
        bed.setStatus(bedDTO.getStatus());
       // bed.setPrice(bedDTO.getPrice());
        bed.setSharing(bedDTO.getSharing());
        bed.setDeposit(bedDTO.getDeposit());
        bedRepository.save(bed);
    }

    @Override
    public List<BedResponseDTO> findAll() {
        List<Bed> beds = bedRepository.findAll();
        List<BedResponseDTO> list = new ArrayList<>();

        for (Bed bed : beds) {
            BedResponseDTO dto = new BedResponseDTO();
            dto.setBedNo(bed.getBedNo());
            dto.setStatus(bed.getStatus());
            list.add(dto);
        }
        return list;
    }

    @Override
    public BedResponseDTO bedById(int id) {
        Bed bed = bedRepository.findById(id).get();
        BedResponseDTO dto = new BedResponseDTO();
        dto.setBedNo(bed.getBedNo());
        dto.setStatus(bed.getStatus());
        return dto;
    }
}
