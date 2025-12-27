package com.hostelmanagement.system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bed_db")
public class Bed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String bedNo;
    private String status;
    private Double price;
    private int sharing;
    private String deposit;

    //Relation-Mapping


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSharing() {
        return sharing;
    }

    public void setSharing(int sharing) {
        this.sharing = sharing;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }
}
