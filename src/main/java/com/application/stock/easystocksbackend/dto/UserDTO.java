package com.application.stock.easystocksbackend.dto;

import com.application.stock.easystocksbackend.model.User;

import javax.persistence.Column;

public class UserDTO {
    private String userId;
    private String firstName;
    private String lastName;
    private String userRole;
    private String createdDate;
    private String createdTime;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userRole = user.getUserRole();
        this.createdDate = user.getCreatedDate();
        this.createdTime = user.getCreatedTime();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
}
