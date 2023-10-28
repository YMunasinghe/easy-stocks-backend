package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.Customer;
import com.application.stock.easystocksbackend.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByProductCategoryNameContainingIgnoreCase(String productCategoryName);
}
