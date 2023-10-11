package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer,String> {

    List<Customer> findByCustomerNameContainingIgnoreCase(String customerName);

}
