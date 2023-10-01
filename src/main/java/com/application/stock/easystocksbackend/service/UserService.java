package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.UserDao;
import com.application.stock.easystocksbackend.dto.UserDTO;
import com.application.stock.easystocksbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
//    public List<User> getAllUser(){
//        List<User> users=this.userDao.findAll();
//        return users;
//    }

    public List<UserDTO> getAllUser() {
        List<User> users=this.userDao.findAll();

        List<UserDTO> userDTOs =new ArrayList<>();
        for(User user:users){
            UserDTO userDTO=new UserDTO(user);
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }


    public User addUser(User user){
        User newUser=this.userDao.saveAndFlush(user);
        return newUser;
    }
    public User getUserById(String userId){
//        User user=this.userDao.findById(userId).orElse(null);
         return this.userDao.findByUserId(userId);
    }

    public List<User> getUserByFirstName(String firstName){
        List<User> users=this.userDao.findAllByFirstName(firstName);
        return users;
    }
    public void deleteUser(String userId){
        this.userDao.deleteUserByUserId(userId);
    }
}
