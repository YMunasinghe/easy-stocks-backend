package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.ProductCategoryDTO;
import com.application.stock.easystocksbackend.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/getAllProductCategories",method = RequestMethod.GET)
    public ResponseEntity<List<ProductCategoryDTO>> getAllProductCategories(){
        List<ProductCategoryDTO> productCategories=this.productCategoryService.getAllProductCategories();
        return new ResponseEntity<>(productCategories, HttpStatus.OK);
    }
}
