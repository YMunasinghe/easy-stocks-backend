package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @Autowired
//    private CustomerRepository customerRepository;
//    @Autowired
//    private ModelMapper modelMapper;

    @RequestMapping(value = "/getAllCustomers",method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
        List<CustomerDTO> customers=this.customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    /**
     * have to output customer list by entered letters
     */
    @RequestMapping(value = "/getCustomerByName/{name}",method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDTO>> getCustomerByName(@PathVariable String name){
        List<CustomerDTO> customer1=this.customerService.getCustomerByName(name);
        return new ResponseEntity<>(customer1,HttpStatus.OK);
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customer) {
        CustomerDTO newCustomer = this.customerService.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
}
