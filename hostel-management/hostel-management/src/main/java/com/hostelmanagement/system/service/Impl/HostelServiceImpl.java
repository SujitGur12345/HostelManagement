package com.hostelmanagement.system.service.Impl;

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
    public Hostel saveHostel(Hostel hostel) {
        return hostelRepository.save(hostel);
    }

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
