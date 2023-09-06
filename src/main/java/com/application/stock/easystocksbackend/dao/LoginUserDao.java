package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserDao extends JpaRepository<LoginUser, String> {

    LoginUser findByUserId(String userId);
}
