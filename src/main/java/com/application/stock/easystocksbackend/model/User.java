package com.application.stock.easystocksbackend.model;

import javax.persistence.*;

@Entity
@Table(name="t_user_acc")
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id", nullable = false, updatable = false)
    private String userId;
    @Column(name = "f_name", nullable = false)
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    @Column(name = "user_role", nullable = false)
    private String userRole;
    @Column(name = "created_date")
    private String createdDate;
    @Column(name = "created_time")
    private String createdTime;

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
