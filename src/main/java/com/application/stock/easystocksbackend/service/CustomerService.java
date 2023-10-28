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

    public CustomerDTO addCustomer(CustomerDTO customerDTO){
        Customer customer=new Customer();

        customer.setCustomerCode(customerDTO.getCustomerCode());
        customer.setCustomerName(customerDTO.getCustomerName());
        customer.setCustomerMobile(customerDTO.getCustomerMobile());
        customer.setCustomerEmail(customerDTO.getCustomerEmail());
        customer.setCustomerAddress(customerDTO.getCustomerAddress());
        customer.setCustomerCreatedDate(customerDTO.getCustomerCreatedDate());
        customer.setCustomerUpdatedDate(customerDTO.getCustomerUpdatedDate());
        customer.setCustomerContactPerson(customerDTO.getCustomerContactPerson());
        customer.setCustomerCreatedTime(customerDTO.getCustomerCreatedTime());
        customer.setCustomerUpdatedTime(customerDTO.getCustomerUpdatedTime());

        customer=this.customerDao.saveAndFlush(customer);
        return new CustomerDTO(customer);
    }
}
