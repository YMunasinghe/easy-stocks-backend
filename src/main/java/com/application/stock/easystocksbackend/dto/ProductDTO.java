package com.application.stock.easystocksbackend.dto;

import com.application.stock.easystocksbackend.model.Product;

import javax.persistence.Column;

public class ProductDTO {
    private String itemCode;
    private String itemName;
    private String itemDescription;
    private Integer categoryCode;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.itemCode = product.getItemCode();
        this.itemName = product.getItemName();
        this.itemDescription = product.getItemDescription();
        this.categoryCode = product.getCategoryCode();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }
}
