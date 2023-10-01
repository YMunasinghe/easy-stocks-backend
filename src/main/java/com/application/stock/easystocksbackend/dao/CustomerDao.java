package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer,String> {
}
