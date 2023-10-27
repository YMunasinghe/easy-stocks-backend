package com.application.stock.easystocksbackend.dao;

import com.application.stock.easystocksbackend.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
}
