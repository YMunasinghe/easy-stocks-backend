package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.UserDTO;
import com.application.stock.easystocksbackend.model.User;
import com.application.stock.easystocksbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
//    public ResponseEntity<List<User>> getAllUser(){
//        List<User> users=this.userService.getAllUser();
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }

    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> getAllUser(){
        List<UserDTO> users=this.userService.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ResponseEntity<User> addUser(@RequestBody User user){
        User user1=this.userService.addUser(user);
        return new ResponseEntity<>(user1,HttpStatus.CREATED);
    }


    /**
     * @PathVariable is used to extract the value of a URL contains (UserId).
     * Method by ChatGpt
     */
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserByUserId(@PathVariable String userId) {
        User user = userService.getUserById(userId);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            // User with the given ID not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    /**
     * Amith Sir code
     */
    @RequestMapping(value = "/getUserById/{userId}",method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable String userId) {
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value="/getUserByFirstName/{firstName}", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getUserByFirstName(@PathVariable String firstName){

        List<User> users=this.userService.getUserByFirstName(firstName);
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

//    @DeleteMapping("/{userId}")
//    public ResponseEntity<Void> deleteUserById(@PathVariable String userId) {
//        boolean deleted = userService.deleteUser(userId);
//
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        } else {
//            // User with the given ID not found
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }
}
