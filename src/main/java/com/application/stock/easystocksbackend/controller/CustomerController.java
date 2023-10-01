package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.UserDTO;
import com.application.stock.easystocksbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getAllCustomers",method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
        List<CustomerDTO> customers=this.customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
