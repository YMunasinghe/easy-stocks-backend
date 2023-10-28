package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.ProductCategoryDTO;
import com.application.stock.easystocksbackend.model.ProductCategory;
import com.application.stock.easystocksbackend.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    /**
     * have to output product category list by entered letters
     */
    @RequestMapping(value = "/getProductCategoryByName/{name}",method = RequestMethod.GET)
    public ResponseEntity<List<ProductCategoryDTO>> getProductCategoryByName(@PathVariable String name){
        List<ProductCategoryDTO> productCategoryDTOS=this.productCategoryService.getProductCategoryByName(name);
        return new ResponseEntity<>(productCategoryDTOS,HttpStatus.OK);
    }

    @RequestMapping(value = "/addProductCategory", method = RequestMethod.POST)
    public ResponseEntity<ProductCategoryDTO> addProductCategory(@RequestBody ProductCategoryDTO productCategoryDTO) {
        //Student student1 = studentService.getStudentById(student.getStudentID());
        ProductCategoryDTO newProductCategory = this.productCategoryService.addProductCategory(productCategoryDTO);
        return new ResponseEntity<>(newProductCategory, HttpStatus.CREATED);
    }
}
