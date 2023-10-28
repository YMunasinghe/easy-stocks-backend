package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.ProductCategoryDao;
import com.application.stock.easystocksbackend.dao.ProductDao;
import com.application.stock.easystocksbackend.dto.ProductDTO;
import com.application.stock.easystocksbackend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductCategoryDao productCategoryDao;

    public List<ProductDTO> getAllProducts() {
        List<Product> products=this.productDao.findAll();

        List<ProductDTO> productDTOS =new ArrayList<>();
        for(Product product:products){
            ProductDTO productDTO=new ProductDTO(product);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

    public List<ProductDTO> getProductByName(String productName){
        List<Product> products=this.productDao.findByItemNameContainingIgnoreCase(productName);

        List<ProductDTO> productDTOS =new ArrayList<>();
        for(Product product:products){
            ProductDTO productDTO=new ProductDTO(product);
            productDTOS.add(productDTO);
        }
        return productDTOS;
    }

//    public Product addProduct(Product product){
//        return this.productDao.saveAndFlush(product);
//    }

    public ProductDTO addProduct(ProductDTO productDTO){
        Product product=new Product();

        product.setItemCode(productDTO.getItemCode());
        product.setItemName(productDTO.getItemName());
        product.setItemDescription(productDTO.getItemDescription());
        product.setProductCategory(this.productCategoryDao.getReferenceById(productDTO.getCategoryCode()));

        product = this.productDao.saveAndFlush(product);
        return new ProductDTO(product);
    }
}
