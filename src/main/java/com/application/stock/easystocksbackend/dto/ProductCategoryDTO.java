package com.application.stock.easystocksbackend.dto;

import com.application.stock.easystocksbackend.model.ProductCategory;

import javax.persistence.Column;

public class ProductCategoryDTO {

    private int productCategoryCode;
    private String productCategoryName;

    public ProductCategoryDTO() {
    }

    public ProductCategoryDTO(ProductCategory productCategory) {
        this.productCategoryCode = productCategory.getProductCategoryCode();
        this.productCategoryName = productCategory.getProductCategoryName();
    }

    public int getProductCategoryCode() {
        return productCategoryCode;
    }

    public void setProductCategoryCode(int productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }
}
