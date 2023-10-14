package com.application.stock.easystocksbackend.model;

import javax.persistence.*;

@Entity
@Table(name="t_customer")
public class Customer {

    @Id
    @Column(name="code", nullable = false, updatable = false)
    private String customerCode;
    @Column(name = "cus_name")
    private String customerName;
    @Column(name = "contact_person")
    private String CustomerContactPerson;
    @Column(name = "mobile")
    private String customerMobile;
    @Column(name = "email")
    private String customerEmail;
    @Column(name = "address")
    private String customerAddress;
    @Column(name = "created_date")
    private String customerCreatedDate;
    @Column(name = "created_time")
    private String customerCreatedTime;
    @Column(name = "updated_date")
    private String customerUpdatedDate;
    @Column(name = "updated_time")
    private String customerUpdatedTime;

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContactPerson() {
        return CustomerContactPerson;
    }

    public void setCustomerContactPerson(String customerContactPerson) {
        CustomerContactPerson = customerContactPerson;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCreatedDate() {
        return customerCreatedDate;
    }

    public void setCustomerCreatedDate(String customerCreatedDate) {
        this.customerCreatedDate = customerCreatedDate;
    }

    public String getCustomerUpdatedDate() {
        return customerUpdatedDate;
    }

    public void setCustomerUpdatedDate(String customerUpdatedDate) {
        this.customerUpdatedDate = customerUpdatedDate;
    }

    public String getCustomerCreatedTime() {
        return customerCreatedTime;
    }

    public void setCustomerCreatedTime(String customerCreatedTime) {
        this.customerCreatedTime = customerCreatedTime;
    }

    public String getCustomerUpdatedTime() {
        return customerUpdatedTime;
    }

    public void setCustomerUpdatedTime(String customerUpdatedTime) {
        this.customerUpdatedTime = customerUpdatedTime;
    }
}
