package com.hostelmanagement.system.service.Impl;

import com.hostelmanagement.system.DTO.HostelRequestDTO;
import com.hostelmanagement.system.DTO.HostelResponseDTO;
import com.hostelmanagement.system.DTO.RoomResponseDTO;
import com.hostelmanagement.system.entity.Hostel;
import com.hostelmanagement.system.repository.HostelRepository;
import com.hostelmanagement.system.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<RoomResponseDTO> getAllHostels() {
       List<Hostel> hostels = hostelRepository.findAll();
       List<RoomResponseDTO> list = new ArrayList<>();


    for (Hostel hostel : hostels) {

        HostelResponseDTO dto = new HostelResponseDTO();

                    dto.setName(hostel.getName());
                    dto.setAddress(hostel.getAddress());
                    dto.setCapacity(hostel.getCapacity());
                    dto.setType(hostel.getType());
                    dto.setImage(hostel.getImage());

                    list.add(dto);

    }
return list;
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
