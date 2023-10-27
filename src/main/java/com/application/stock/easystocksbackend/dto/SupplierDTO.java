package com.application.stock.easystocksbackend.dto;

import com.application.stock.easystocksbackend.model.Customer;
import com.application.stock.easystocksbackend.model.Supplier;

public class SupplierDTO {

    private String supplierCode;
    private String supplierName;
    private String supplierContactPerson;
    private String supplierMobile;
    private String supplierEmail;
    private String supplierAddress;
    private String supplierCreatedDate;
    private String supplierCreatedTime;
    private String supplierUpdatedDate;
    private String supplierUpdatedTime;

    public SupplierDTO() {
    }

    public SupplierDTO(Supplier supplier) {
        this.supplierCode = supplier.getSupplierCode();
        this.supplierName = supplier.getSupplierName();
        this.supplierContactPerson=supplier.getSupplierContactPerson();
        this.supplierMobile = supplier.getSupplierMobile();
        this.supplierEmail = supplier.getSupplierEmail();
        this.supplierAddress = supplier.getSupplierAddress();
        this.supplierCreatedDate = supplier.getSupplierCreatedDate();
        this.supplierCreatedTime = supplier.getSupplierCreatedTime();
        this.supplierUpdatedDate = supplier.getSupplierUpdatedDate();
        this.supplierUpdatedTime = supplier.getSupplierUpdatedTime();
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierContactPerson() {
        return supplierContactPerson;
    }

    public void setSupplierContactPerson(String supplierContactPerson) {
        this.supplierContactPerson = supplierContactPerson;
    }

    public String getSupplierMobile() {
        return supplierMobile;
    }

    public void setSupplierMobile(String supplierMobile) {
        this.supplierMobile = supplierMobile;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierCreatedDate() {
        return supplierCreatedDate;
    }

    public void setSupplierCreatedDate(String supplierCreatedDate) {
        this.supplierCreatedDate = supplierCreatedDate;
    }

    public String getSupplierCreatedTime() {
        return supplierCreatedTime;
    }

    public void setSupplierCreatedTime(String supplierCreatedTime) {
        this.supplierCreatedTime = supplierCreatedTime;
    }

    public String getSupplierUpdatedDate() {
        return supplierUpdatedDate;
    }

    public void setSupplierUpdatedDate(String supplierUpdatedDate) {
        this.supplierUpdatedDate = supplierUpdatedDate;
    }

    public String getSupplierUpdatedTime() {
        return supplierUpdatedTime;
    }

    public void setSupplierUpdatedTime(String supplierUpdatedTime) {
        this.supplierUpdatedTime = supplierUpdatedTime;
    }
}
