package com.application.stock.easystocksbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user_login")
public class LoginUser {

    @Id
    @Column(name = "userId", nullable = false, updatable = false)
    private String userId;
    @Column(name = "password", nullable = false)
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
