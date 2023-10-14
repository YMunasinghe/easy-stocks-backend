package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.CustomerDao;
//import com.application.stock.easystocksbackend.dto.UserDTO;
import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.model.Customer;
//import com.application.stock.easystocksbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers=this.customerDao.findAll();

        List<CustomerDTO> customerDTOs =new ArrayList<>();
        for(Customer customer:customers){
            CustomerDTO customerDTO=new CustomerDTO(customer);
            customerDTOs.add(customerDTO);
        }
        return customerDTOs;
    }

//    public CustomerDTO findByCustomerName(String customerName){
//        Customer customer = this.customerDao.findByCustomerName(customerName);
//        CustomerDTO customerDTO1 = new CustomerDTO(customer);
//
//        return customerDTO1;
//    }

    public List<CustomerDTO> getCustomerByName(String customerName){
        List<Customer> customers=this.customerDao.findByCustomerNameContainingIgnoreCase(customerName);

        List<CustomerDTO> customerDTOs =new ArrayList<>();
        for(Customer customer:customers){
            CustomerDTO customerDTO=new CustomerDTO(customer);
            customerDTOs.add(customerDTO);
        }
        return customerDTOs;
    }

    public Customer addStudent(Customer customer){
        return this.customerDao.saveAndFlush(customer);
    }
}
