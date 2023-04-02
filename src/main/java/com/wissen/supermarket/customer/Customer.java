package com.wissen.supermarket.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@Column(name="phoneNumber")
	private long phoneNumber;
	
	@Column(name="name")
	private String name;


	@Column(name="email")
	private String email;

	// initialization
	public Customer(){}
	
	public Customer(String name,long phoneNumber,String email){
		
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.email=email;

	}

	// Setter Methods
	
	
	public void setName(String name){
		this.name=name;
	}

	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber=phoneNumber;
	}

	public void setEmail(String email){
		this.email=email;
	}

	// Getter Methods
	
	
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
