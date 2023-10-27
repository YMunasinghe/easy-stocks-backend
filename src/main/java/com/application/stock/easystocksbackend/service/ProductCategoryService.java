package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.ProductCategoryDao;
import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.ProductCategoryDTO;
import com.application.stock.easystocksbackend.model.Customer;
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
}
