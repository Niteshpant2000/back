package com.wissen.supermarket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wissen.supermarket.inventory.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, String>{
	// get all
	// get item by id, name
	// get "most purchased item", "newly added items"
	// add new items
	// remove items
	// update items -> discount, decrement due to purchase, increment when restocking

    // GET INVENTORY LIST ACCORDING TO ORDER OF NAME
	@Query(value="select * from inventory order by name", nativeQuery=true)
	public List<Inventory> filterByName(String name);

	
}
