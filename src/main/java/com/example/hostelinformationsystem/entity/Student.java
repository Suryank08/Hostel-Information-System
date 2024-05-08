package com.example.hostelinformationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "roll_number")
    private String rollNumber;
    @Column(name = "branch")
    private String branch;
    @Column(name = "address")
    private String address;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "hostel_name")
    private String hostelName;

    @Column(name="room_number")
    private String roomNumber;

    public Student() {
    }

    public Student(String name, String rollNumber, String branch, String address, String mobileNumber, String hostelName, String roomNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}


