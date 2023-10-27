package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.ProductDao;
import com.application.stock.easystocksbackend.dto.ProductCategoryDTO;
import com.application.stock.easystocksbackend.dto.ProductDTO;
import com.application.stock.easystocksbackend.model.Product;
import com.application.stock.easystocksbackend.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<ProductDTO> getAllProducts() {
        List<Product> products=this.productDao.findAll();

        List<ProductDTO> productDTOS =new ArrayList<>();
        for(Product product:products){
            ProductDTO productDTO=new ProductDTO(product);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }
}
