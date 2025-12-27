package com.hostelmanagement.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "building_db")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Integer floors;
    private String warden;

    //Relationship-Mapping


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public String getWarden() {
        return warden;
    }

    public void setWarden(String warden) {
        this.warden = warden;
    }
}
