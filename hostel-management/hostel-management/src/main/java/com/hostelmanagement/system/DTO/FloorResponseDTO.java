package com.hostelmanagement.system.DTO;

import jakarta.persistence.Column;

public class FloorResponseDTO {

    private Integer floorNo;


    private String floorName;

    //Getter and Setter


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
