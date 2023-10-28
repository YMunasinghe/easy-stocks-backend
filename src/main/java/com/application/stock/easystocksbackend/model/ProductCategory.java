package com.application.stock.easystocksbackend.model;

import javax.persistence.*;

@Entity
@Table(name="t_product_category")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_code", nullable = false, updatable = false)
    private Integer productCategoryCode;
    @Column(name = "category_name")
    private String productCategoryName;

    public ProductCategory() {
    }

    public ProductCategory(Integer productCategoryCode, String productCategoryName) {
        this.productCategoryCode = productCategoryCode;
        this.productCategoryName = productCategoryName;
    }

    public Integer getProductCategoryCode() {
        return productCategoryCode;
    }

    public void setProductCategoryCode(Integer productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}