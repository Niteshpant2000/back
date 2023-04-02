package com.wissen.supermarket.transaction;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="customerId")
    private long customerId;

    @Column(name="dateTime")
    private String dateTime;

    @Column(name="productDetails")
    private String productDetails;

    @Column(name="totalAmount")
    private double totalAmount;

    @Column(name="paymentType")
    private String paymentType;

    // constuctors - intializers

    public Transaction(){}

    public Transaction(String id, long customerId, String dateTime, String productDetails, double totalAmount, String paymentType){
        this.id = id;
        this.customerId = customerId;
        this.dateTime = dateTime;
        this.productDetails = productDetails;
        this.totalAmount = totalAmount;
        this.paymentType = paymentType;
    }

    // getter methods

    public String getId(){
        return this.id;
    }
    public long getCustomerId(){
        return this.customerId;
    }
    
    public String getDateTime(){
        return this.dateTime;
    }

    public String getProductDetails(){
        return this.productDetails;
    }

    public double getTotalAmount(){
        return this.totalAmount;
    }

    public String getPaymentType(){
        return this.paymentType;
    }

    // setter methods
    
    public void setId(String id){
        this.id = id;
    }

    public void setCustomerId(long customerId){
        this.customerId = customerId;
    }

    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }

    public void setProductDetails(String productDetails){
        this.productDetails = productDetails;
    }

    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void setPaymentType(String paymentType){
        this.paymentType = paymentType;
    }
}