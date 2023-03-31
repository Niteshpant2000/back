package com.wissen.supermarket.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="id")
	private String id;

	@Column(name="name")
	private String name;

	@Column(name="age")
	private int age;

	@Column(name="email")
	private String email;

	@Column(name="phoneNumber")
	private long phoneNumber;

	@Column(name="workTimings")
	private String workTimings;

	@Column(name="salary")
	private float salary;

	@Column(name="designation")
	private String designation;
	
	// constructors - initiators
	public Employee() {}
	
	public Employee(String id, String name, int age, String email, long phoneNumber, String workTimings, float salary, String designation){
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.workTimings = workTimings;
		this.salary = salary;
		this.designation = designation;
	}
	
	// getter methods
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public long getPhoneNumber(){
		return this.phoneNumber;
	}
	
	public String getWorkTimings() {
		return this.workTimings;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public String getDesignation() {
		return this.designation;
	}
	
	// setter methods
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void setWorkTimings(String workTimings) {
		this.workTimings = workTimings;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}