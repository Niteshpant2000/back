package com.wissen.supermarket.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name="id")
	private String id;

	@Column(name="name")
	private String name;

	@Column(name="phoneNumber")
	private int phoneNumber;

	@Column(name="email")
	private String email;

	// initialization
	public Customer(){}
	
	public Customer(String id,String name,int phoneNumber,String email){
		this.id=id;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;

	}

	// Setter Methods
	public void setId(String id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}

	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber=phoneNumber;
	}

	public void setEmail(String email){
		this.email=email;
	}

	// Getter Methods
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
}
