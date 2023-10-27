package com.application.stock.easystocksbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_supplier")
public class Supplier {
    @Id
    @Column(name="code", nullable = false, updatable = false)
    private String supplierCode;
    @Column(name = "sup_name", nullable = false)
    private String supplierName;
    @Column(name = "contact_person")
    private String supplierContactPerson;
    @Column(name = "mobile")
    private String supplierMobile;
    @Column(name = "email")
    private String supplierEmail;
    @Column(name = "address")
    private String supplierAddress;
    @Column(name = "created_date")
    private String supplierCreatedDate;
    @Column(name = "created_time")
    private String supplierCreatedTime;
    @Column(name = "updated_date")
    private String supplierUpdatedDate;
    @Column(name = "updated_time")
    private String supplierUpdatedTime;

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
