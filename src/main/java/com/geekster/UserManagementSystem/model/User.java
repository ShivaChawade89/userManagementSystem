package com.geekster.UserManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class User {
    private int UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String PhoneNumber;
    public User(int userId, String name, String userName, String address, String phoneNumber) {
        this.UserId = userId;
        this.Name = name;
        this.UserName = userName;
        this.Address = address;
        this.PhoneNumber = phoneNumber;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }




}
