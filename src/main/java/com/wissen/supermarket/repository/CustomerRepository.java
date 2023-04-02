package com.wissen.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissen.supermarket.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    // add new -> by Cashier, Admin
    // update customer
    // previous transactions
}