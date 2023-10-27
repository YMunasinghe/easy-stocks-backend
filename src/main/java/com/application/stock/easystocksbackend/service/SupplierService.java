package com.application.stock.easystocksbackend.service;

import com.application.stock.easystocksbackend.dao.SupplierDao;
import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.SupplierDTO;
import com.application.stock.easystocksbackend.model.Customer;
import com.application.stock.easystocksbackend.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    public List<SupplierDTO> getAllSuppliers() {
        List<Supplier> suppliers=this.supplierDao.findAll();

        List<SupplierDTO> supplierDTOS =new ArrayList<>();
        for(Supplier supplier:suppliers){
            SupplierDTO supplierDTO=new SupplierDTO(supplier);
            supplierDTOS.add(supplierDTO);
        }
        return supplierDTOS;
    }

    public List<SupplierDTO> getSupplierByName(String supplierName){
        List<Supplier> suppliers=this.supplierDao.findBySupplierNameContainingIgnoreCase(supplierName);

        List<SupplierDTO> supplierDTOs =new ArrayList<>();
        for(Supplier supplier:suppliers){
            SupplierDTO supplierDTO=new SupplierDTO(supplier);
            supplierDTOs.add(supplierDTO);
        }
        return supplierDTOs;
    }

    public Supplier addSupplier(Supplier supplier){
        return this.supplierDao.saveAndFlush(supplier);
    }
}
