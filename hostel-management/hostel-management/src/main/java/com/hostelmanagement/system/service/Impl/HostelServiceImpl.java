package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.HostelRequestDTO;
import com.hostelmanagement.system.entity.Hostel;
import com.hostelmanagement.system.repository.HostelRepository;
import com.hostelmanagement.system.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelServiceImpl implements HostelService {


    @Autowired
    HostelRepository hostelRepository;


    @Override
    public void saveHostel(HostelRequestDTO hosteldto) {


        Hostel hostel = new Hostel();
        hostel.setName(hosteldto.getName());
        hostel.setAddress(hosteldto.getAddress());
        hostel.setType(hosteldto.getType());


         hostelRepository.save(hostel);

    }
    // name;
    //    private String address;
    //    private Integer capacity;
    //    private String website;
    //    private String contactNo;
    //    private String type




    @Override
    public List<Hostel> getAllHostels() {
        return hostelRepository.findAll();
    }

    @Override
    public Hostel getHostelById(int id) {
        return hostelRepository.findById(id).get();
    }

    @Override
    public void deleteHostel(int id) {

        hostelRepository.deleteById(id);

    }
}
