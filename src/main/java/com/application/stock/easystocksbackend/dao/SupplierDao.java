package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.Customer;
import com.application.stock.easystocksbackend.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierDao extends JpaRepository<Supplier,String> {

    List<Supplier> findBySupplierNameContainingIgnoreCase(String supplierName);
}
