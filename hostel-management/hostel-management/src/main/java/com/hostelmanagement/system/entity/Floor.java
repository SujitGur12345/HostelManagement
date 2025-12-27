package com.hostelmanagement.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "floor_db")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public Integer floorNo;
    private String floorName;

    //Relation - Mapping


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
