package com.wissen.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissen.supermarket.employee.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, String>{
    // add cashier
    // remove cashier
    // update cashier
    // get cashiers List
}
