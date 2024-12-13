package com.example.demo.service;

import java.util.List;

import com.example.demo.model.InventoryItem;

public interface InventoryItemService {

    InventoryItem addInventoryItem(InventoryItem inventoryItem);

    List<InventoryItem> getAllInventoryItems();

    InventoryItem getInventoryItemById(int inventoryId);

    InventoryItem updateInventoryItemById(int inventoryId, InventoryItem inventoryItem);

    String deleteInventoryItemById(int inventoryId);

    List<InventoryItem> getInventoryItemsByItemId(int itemId);

   // List<InventoryItem> getInventoryItemsBySupplierId(int supplierId);

    List<InventoryItem> getInventoryItemsByStockLevel(int stockLevel);

    List<InventoryItem> getInventoryItemsByMinimumLevel(int minimumLevel);
}
