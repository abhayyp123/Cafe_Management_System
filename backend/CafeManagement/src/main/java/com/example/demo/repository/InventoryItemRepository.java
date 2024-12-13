package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.InventoryItem;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, Integer> {

    // Method to find InventoryItems by Item ID
    List<InventoryItem> findBymenuItemItemId(int itemId);
    	
 // Method to find InventoryItems by Supplier ID
   // List<InventoryItem> findBySupplierId(int supplierId);
    
    // Method to find InventoryItems by Stock Level
    List<InventoryItem> findByStockLevel(int stockLevel);
    
    // Method to find InventoryItems by Minimum Level
    List<InventoryItem> findByMinimumLevel(int minimumLevel);
}
