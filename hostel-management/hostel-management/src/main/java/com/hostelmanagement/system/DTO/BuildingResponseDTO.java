package com.hostelmanagement.system.DTO;

public class BuildingResponseDTO {
    private String name;
    private Integer floors;
    private String warden;

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
