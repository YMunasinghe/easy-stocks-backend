package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, String> {

    User findByUserId(String userId);
    List<User> findAllByFirstName(String firstName);
    void deleteUserByUserId(String userId);
}
