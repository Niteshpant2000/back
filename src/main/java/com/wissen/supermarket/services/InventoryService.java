package com.wissen.supermarket.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.supermarket.inventory.Inventory;
import com.wissen.supermarket.repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;
    
    // all database queries related to Inventory

    // get Products
    public List<Inventory> getAllInventory(){
        List<Inventory> productList = inventoryRepository.findAll();
        return productList;
    }

    // get Product by id
    public Optional<Inventory> getProductById(String id){
        Optional<Inventory> product = inventoryRepository.findById(id);
        return product;
    }

    // update Product
    public String updateInventory(Inventory productObj, boolean check){
        Optional<Inventory> product = inventoryRepository.findById(productObj.getId());
        if(product.isPresent()){
            Inventory productToUpdate=product.get();
            productToUpdate.setName(productObj.getName());
            productToUpdate.setDescription(productObj.getDescription());
            productToUpdate.setCost(productObj.getCost());
            productToUpdate.setRating(productObj.getRating());
            productToUpdate.setManufacturer(productObj.getManufacturer());
            productToUpdate.setDiscount(productObj.getDiscount());
            
            /* updating product quantity 
                (true, +) -> Adding more products to exsisting inventory
                (false, -) -> Removing products, bought by customers
            */
            long temp=productToUpdate.getQuantity();
            if(check == true){
                productToUpdate.setQuantity(temp + productObj.getQuantity());
            }
            else{
                productToUpdate.setQuantity(productObj.getQuantity());
            }

            inventoryRepository.save(productToUpdate);
            return "Product details have been updated successfully.";
        }
        else{
            return "Product could not be found.";
        } 
    }

    // add Product
    public void addProduct(Inventory product){
        Optional<Inventory> checkProduct=inventoryRepository.findById(product.getId());
        if(checkProduct.isPresent()){
            this.updateInventory(product, true);
            return;
        }
        inventoryRepository.save(product);
    }

    // remove Product
    public String removeProduct(String id){
        Optional<Inventory> product = inventoryRepository.findById(id);
        if(product.isPresent()){
            inventoryRepository.deleteById(id);
            return "removed product successfully.";
        }
        return "unable to find such product"; 
    }
}
