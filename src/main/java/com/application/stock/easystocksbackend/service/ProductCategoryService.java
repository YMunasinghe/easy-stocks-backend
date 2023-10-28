package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.ProductCategoryDao;
import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.ProductCategoryDTO;
import com.application.stock.easystocksbackend.dto.ProductDTO;
import com.application.stock.easystocksbackend.model.Customer;
import com.application.stock.easystocksbackend.model.Product;
import com.application.stock.easystocksbackend.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    public List<ProductCategoryDTO> getAllProductCategories() {
        List<ProductCategory> productCategories=this.productCategoryDao.findAll();

        List<ProductCategoryDTO> productCategoryDTOS =new ArrayList<>();
        for(ProductCategory productCategory:productCategories){
            ProductCategoryDTO productCategoryDTO=new ProductCategoryDTO(productCategory);
            productCategoryDTOS.add(productCategoryDTO);
        }
        return productCategoryDTOS;
    }

    public List<ProductCategoryDTO> getProductCategoryByName(String productCategoryName){
        List<ProductCategory> productCategories=this.productCategoryDao.findByProductCategoryNameContainingIgnoreCase(productCategoryName);

        List<ProductCategoryDTO> productCategoryDTOS =new ArrayList<>();
        for(ProductCategory productCategory:productCategories){
            ProductCategoryDTO productCategoryDTO=new ProductCategoryDTO(productCategory);
            productCategoryDTOS.add(productCategoryDTO);
        }
        return productCategoryDTOS;
    }

//    public ProductCategory addProductCategory(ProductCategory productCategory){
//        return this.productCategoryDao.saveAndFlush(productCategory);
//    }

    public ProductCategoryDTO addProductCategory(ProductCategoryDTO productCategoryDTO){
        ProductCategory productCategory=new ProductCategory();

        productCategory.setProductCategoryName(productCategoryDTO.getProductCategoryName());

        productCategory = this.productCategoryDao.saveAndFlush(productCategory);
        return new ProductCategoryDTO(productCategory);
    }
}
