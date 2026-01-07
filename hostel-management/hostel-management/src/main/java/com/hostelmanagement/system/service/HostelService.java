package com.hostelmanagement.system.service;

import com.hostelmanagement.system.DTO.HostelRequestDTO;
import com.hostelmanagement.system.DTO.RoomResponseDTO;
import com.hostelmanagement.system.entity.Hostel;

import java.util.List;


public interface HostelService {


 void saveHostel(HostelRequestDTO hostel);
List<RoomResponseDTO> getAllHostels();

    Hostel getHostelById(int id);

    void deleteHostel(int id);


}
