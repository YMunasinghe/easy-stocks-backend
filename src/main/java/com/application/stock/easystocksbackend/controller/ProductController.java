package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.ProductCategoryDTO;
import com.application.stock.easystocksbackend.dto.ProductDTO;
import com.application.stock.easystocksbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getAllProducts",method = RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        List<ProductDTO> products=this.productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
