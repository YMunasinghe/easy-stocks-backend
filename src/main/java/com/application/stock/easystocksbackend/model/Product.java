package com.application.stock.easystocksbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "t_product")
public class Product {

    @Id
    @Column(name = "item_code",nullable = false,updatable = false)
    private String itemCode;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_description")
    private String itemDescription;
//    @Column(name = "category_code")
//    private Integer categoryCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_code")
    private ProductCategory productCategory;

//    public Product(String itemCode, String itemName, String itemDescription, Integer categoryCode) {
//        this.itemCode = itemCode;
//        this.itemName = itemName;
//        this.itemDescription = itemDescription;
////        this.categoryCode = categoryCode;
//    }

    public Product() {
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

//    public Integer getCategoryCode() {
//        return categoryCode;
//    }
//
//    public void setCategoryCode(Integer categoryCode) {
//        this.categoryCode = categoryCode;
//    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
