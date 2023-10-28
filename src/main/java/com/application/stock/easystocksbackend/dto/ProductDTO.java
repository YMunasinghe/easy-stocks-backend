package com.application.stock.easystocksbackend.dto;

import com.application.stock.easystocksbackend.model.Product;

import javax.persistence.Column;

public class ProductDTO {
    private String itemCode;
    private String itemName;
    private String itemDescription;
    private Integer categoryCode;
    private String categoryName;

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        this.itemCode = product.getItemCode();
        this.itemName = product.getItemName();
        this.itemDescription = product.getItemDescription();
//        this.categoryCode = product.getCategoryCode();

        /**
         * If there is no product category to a product
         *  there is a possibility to occur an exception
         */
        if (product.getProductCategory()!=null){
            this.categoryCode = product.getProductCategory().getProductCategoryCode();
            this.categoryName = product.getProductCategory().getProductCategoryName();
        }
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
