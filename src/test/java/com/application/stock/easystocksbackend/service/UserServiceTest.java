package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void getAllUser() {
        this.userService.getAllUser();
    }

    @Test
    void addUser() {
        User user=new User();
        user.setUserId("yasiru01.001");
        user.setFirstName("Yasiru");
        user.setLastName("Dilshan");
        user.setUserRole("Admin");
        user.setCreatedDate("2021-01-01");
        user.setCreatedTime("10:00:00");

        userService.addUser(user);
    }

    @Test
    void getUserById() {
        this.userService.getUserById("yasiru01.001");
    }

    @Test
    void deleteUser() {
        this.userService.deleteUser("yasiru01.001");
    }
}