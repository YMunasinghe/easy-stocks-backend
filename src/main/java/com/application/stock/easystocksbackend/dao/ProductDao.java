package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product,String> {

}
