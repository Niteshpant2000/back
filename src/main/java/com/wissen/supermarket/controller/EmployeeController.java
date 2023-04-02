package com.wissen.supermarket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.supermarket.customer.Customer;
import com.wissen.supermarket.employee.Employee;
import com.wissen.supermarket.inventory.Inventory;
import com.wissen.supermarket.services.CustomerService;
import com.wissen.supermarket.services.EmployeeService;
import com.wissen.supermarket.services.InventoryService;
import com.wissen.supermarket.services.TransactionService;
import com.wissen.supermarket.transaction.Transaction;

@RestController
@RequestMapping(value="/api/employee")
public class EmployeeController {

	@Autowired
	InventoryService inventoryService;

	@Autowired
	CustomerService customerService;

	@Autowired
	EmployeeService employeeService;

	@Autowired
	TransactionService transactionService;

	// get all products
	@GetMapping(path="/getInventory")
	List<Inventory> getAllInventory(){
		List<Inventory> productList = inventoryService.getAllInventory();
		if(productList.size() == 0)
			return productList;		// change this
		else
			return productList;
	}
	
	// get product by id
	@GetMapping(path="/getInventory/{id}")
	Inventory getProduct(@PathVariable String id) {
		Optional<Inventory> prodObjOptional = inventoryService.getProductById(id);
		if(prodObjOptional.isPresent()){
			Inventory prodObj = prodObjOptional.get();
			return prodObj;
		}
		return new Inventory();
	}

	

	// get all customer
	@GetMapping(path="/getCustomer")
	List<Customer> getCustomer(){
		List<Customer> customerList = customerService.getAllCustomer();
		if(customerList.size() == 0)
			return customerList;		// change this
		else
			return customerList;
	}

	// create customer
	@PostMapping(path="/addCustomer")
	String addCustomer(@RequestBody Customer customer) {
		Optional<Customer>checkCustomer=customerService.getCustomerById(customer.getPhoneNumber());
		if(checkCustomer.isPresent()){
			return "Already present in database";
		}
		customerService.addCustomer(customer);
		return "Customer Inserted Successfully";
	}
	// get all transactions
	@GetMapping(path="/getTransaction")
	List<Transaction> getTransaction(){
		List<Transaction> transactionList = transactionService.getAllTransaction();
		if(transactionList.size() == 0)
			return transactionList;		// change this
		else
			return transactionList;
	}

	// get transaction by id
	@GetMapping(path="/getTransaction/{id}")
	Transaction getTransaction(@PathVariable String id) {
		Optional<Transaction> transactionObjOptional = transactionService.getTransactionById(id);
		if(transactionObjOptional.isPresent()){
			Transaction transactionObj = transactionObjOptional.get();
			return transactionObj;
		}
		return new Transaction();
	}

	//get transaction by customer id
	@GetMapping(path="/getTransactionByCustomerId/{id}")
	List<Transaction> getTransactionByCustomerId(@PathVariable long id) {
		List<Transaction> transactionObjOptional = transactionService.getTransactionByCustomerId(id);
		
		return transactionObjOptional;
	}
	// create transaction
	@PostMapping(path="/addTransaction")
	void addTransaction(@RequestBody Transaction transaction) {
		System.out.println("here");
		transactionService.addTransaction(transaction);
	}


}