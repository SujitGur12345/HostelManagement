package com.hostelmanagement.system.DTO.Request;

public class RoomRequestDTO {


    private int roomNo;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
}
//RoomRequestDTO