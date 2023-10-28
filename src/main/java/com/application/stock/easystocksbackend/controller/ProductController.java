package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.ProductDTO;
import com.application.stock.easystocksbackend.model.Product;
import com.application.stock.easystocksbackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /**
     * have to output product category list by entered letters
     */
    @RequestMapping(value = "/getProductByName/{name}",method = RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> getProductByName(@PathVariable String name){
        List<ProductDTO> productDTOS=this.productService.getProductByName(name);
        return new ResponseEntity<>(productDTOS,HttpStatus.OK);
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO product) {
        //Student student1 = studentService.getStudentById(student.getStudentID());
        ProductDTO newProduct = this.productService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

}
