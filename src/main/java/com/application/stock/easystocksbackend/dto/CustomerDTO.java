package com.application.stock.easystocksbackend.dto;

import com.application.stock.easystocksbackend.model.Customer;

import javax.persistence.Column;
import javax.persistence.Id;

public class CustomerDTO {

    private String customerCode;
    private String customerName;
    private String customerContactPerson;
    private String customerMobile;
    private String customerEmail;
    private String customerAddress;
    private String customerCreatedDate;
    private String customerCreatedTime;
    private String customerUpdatedDate;
    private String customerUpdatedTime;

    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer) {
        this.customerCode = customer.getCustomerCode();
        this.customerName = customer.getCustomerName();
        this.customerContactPerson=customer.getCustomerContactPerson();
        this.customerMobile = customer.getCustomerMobile();
        this.customerEmail = customer.getCustomerEmail();
        this.customerAddress = customer.getCustomerAddress();
        this.customerCreatedDate = customer.getCustomerCreatedDate();
        this.customerCreatedTime = customer.getCustomerCreatedTime();
        this.customerUpdatedDate = customer.getCustomerUpdatedDate();
        this.customerUpdatedTime = customer.getCustomerUpdatedTime();
    }

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
        return customerContactPerson;
    }

    public void setCustomerContactPerson(String customerContactPerson) {
        this.customerContactPerson = customerContactPerson;
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
