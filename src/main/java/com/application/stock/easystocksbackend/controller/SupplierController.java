package com.application.stock.easystocksbackend.controller;

import com.application.stock.easystocksbackend.dto.CustomerDTO;
import com.application.stock.easystocksbackend.dto.SupplierDTO;
import com.application.stock.easystocksbackend.model.Customer;
import com.application.stock.easystocksbackend.model.Supplier;
import com.application.stock.easystocksbackend.service.CustomerService;
import com.application.stock.easystocksbackend.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @RequestMapping(value = "/getAllSuppliers",method = RequestMethod.GET)
    public ResponseEntity<List<SupplierDTO>> getAllSuppliers(){
        List<SupplierDTO> supplierDTOS=this.supplierService.getAllSuppliers();
        return new ResponseEntity<>(supplierDTOS, HttpStatus.OK);
    }

    /**
     * have to output customer list by entered letters
     */
    @RequestMapping(value = "/getSupplierByName/{name}",method = RequestMethod.GET)
    public ResponseEntity<List<SupplierDTO>> getSupplierByName(@PathVariable String name){
        List<SupplierDTO> supplierDTOS=this.supplierService.getSupplierByName(name);
        return new ResponseEntity<>(supplierDTOS,HttpStatus.OK);
    }

    @RequestMapping(value = "/addSupplier", method = RequestMethod.POST)
    public ResponseEntity<SupplierDTO> addSupplier(@RequestBody SupplierDTO supplier) {
        //Student student1 = studentService.getStudentById(student.getStudentID());
        SupplierDTO newSupplier = this.supplierService.addSupplier(supplier);
        return new ResponseEntity<>(newSupplier, HttpStatus.CREATED);
    }
}
