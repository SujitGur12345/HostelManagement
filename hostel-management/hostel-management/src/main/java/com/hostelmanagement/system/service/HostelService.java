package com.hostelmanagement.system.service;

import com.hostelmanagement.system.entity.Hostel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HostelService {


Hostel saveHostel(Hostel hostel);
List<Hostel>getAllHostels();

    Hostel getHostelById(int id);

    void deleteHostel(int id);


}
