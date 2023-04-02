package com.wissen.supermarket.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.wissen.supermarket.inventory.Inventory;
import com.wissen.supermarket.services.InventoryService;
import com.wissen.supermarket.services.TransactionService;
import com.wissen.supermarket.transaction.Transaction;

@RestController
@RequestMapping(value="/api/customer")
public class CustomerController {

	@Autowired
	InventoryService inventoryService;

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
	

	//get transaction by customer id
	@GetMapping(path="/getTransactionByCustomerId/{id}")
	List<Transaction> getTransactionByCustomerId(@PathVariable long id) {
		List<Transaction> transactionObjOptional = transactionService.getTransactionByCustomerId(id);
		
		return transactionObjOptional;
	}


}