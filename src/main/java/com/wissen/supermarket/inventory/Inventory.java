package com.wissen.supermarket.inventory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Inventory")
public class Inventory {

	@Id
	@Column(name="id")
	private String id;

	@Column(name="name")
	private String name;

	@Column(name="description")
	private String description;

	@Column(name="cost")
	private double cost;

	@Column(name="rating")
	private float rating;

	@Column(name="manufacturer")
	private String manufacturer;



	@Column(name="discount")
	private float discount;

	@Column(name="quantity")
	private long quantity;
	
	// constructors - initializers
	public Inventory(){}
	
	public Inventory(String id, String name, String description, double cost, float rating, String manufacturer, float discount, long quantity){
		this.id = id;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.rating = rating;
		this.manufacturer = manufacturer;
		
		this.discount = discount;
		this.quantity = quantity;
	}
	
	// getter methods
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public float getRating() {
		return this.rating;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}


	
	public float getDiscount() {
		return this.discount;
	}
	
	public long getQuantity() {
		return this.quantity;
	}
	
	// setter methods
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}