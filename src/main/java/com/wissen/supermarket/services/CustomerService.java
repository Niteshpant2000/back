package com.wissen.supermarket.services;
import com.wissen.supermarket.customer.Customer;
import com.wissen.supermarket.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
        // add services
        @Autowired
        CustomerRepository customerRepository;
        
        // get all Customers
        public List<Customer> getAllCustomer(){
            return customerRepository.findAll();
        }

        // add Customer
        public void addCustomer(Customer customer){
            customerRepository.save(customer);
        }

        public Optional<Customer> getCustomerById(long id){
            Optional<Customer>customer=customerRepository.findById(id);
            return customer;

        }
}
