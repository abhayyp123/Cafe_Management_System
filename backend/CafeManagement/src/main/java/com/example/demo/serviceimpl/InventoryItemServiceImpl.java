package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.InventoryItem;
import com.example.demo.repository.InventoryItemRepository;
import com.example.demo.service.InventoryItemService;

@Service
public class InventoryItemServiceImpl implements InventoryItemService {

    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    @Override
    public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
        return inventoryItemRepository.save(inventoryItem);
    }

    @Override
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemRepository.findAll();
    }

    @Override
    public InventoryItem getInventoryItemById(int inventoryId) {
        Optional<InventoryItem> inventoryItem = inventoryItemRepository.findById(inventoryId);
        return inventoryItem.orElse(null);
    }

    @Override
    public InventoryItem updateInventoryItemById(int inventoryId, InventoryItem inventoryItem) {
        if (inventoryItemRepository.existsById(inventoryId)) {
            inventoryItem.setInventoryId(inventoryId);
            return inventoryItemRepository.save(inventoryItem);
        }
        return null;
    }

    @Override
    public String deleteInventoryItemById(int inventoryId) {
        if (inventoryItemRepository.existsById(inventoryId)) {
            inventoryItemRepository.deleteById(inventoryId);
            return "InventoryItem with ID " + inventoryId + " deleted successfully";
        }
        return "InventoryItem with ID " + inventoryId + " not found";
    }

    @Override
    public List<InventoryItem> getInventoryItemsByItemId(int itemId) {
        return inventoryItemRepository.findBymenuItemItemId(itemId);
    }

   // @Override
 //   public List<InventoryItem> getInventoryItemsBySupplierId(int supplierId) {
   //     return inventoryItemRepository.findBySupplierId(supplierId);
   // }

    @Override
    public List<InventoryItem> getInventoryItemsByStockLevel(int stockLevel) {
        return inventoryItemRepository.findByStockLevel(stockLevel);
    }

    @Override
    public List<InventoryItem> getInventoryItemsByMinimumLevel(int minimumLevel) {
        return inventoryItemRepository.findByMinimumLevel(minimumLevel);
    }
}
