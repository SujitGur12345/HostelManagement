package com.hostelmanagement.system.repository;

import com.hostelmanagement.system.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Integer> {
}
