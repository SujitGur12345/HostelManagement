package com.hostelmanagement.system.DTO;

import jakarta.persistence.Column;

public class FloorRequestDTO {


    private Integer floorNo;


    private String floorName;

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }
}
