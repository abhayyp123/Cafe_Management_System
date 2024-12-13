package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.InventoryItem;
import com.example.demo.service.InventoryItemService;

@RestController
@RequestMapping("api/CafeInventory/inventoryitems/")
@CrossOrigin(origins = "http://localhost:4200/")
public class InventoryItemController {

    @Autowired
    private InventoryItemService inventoryItemService;

    @PostMapping
    public ResponseEntity<InventoryItem> addInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return new ResponseEntity<>(inventoryItemService.addInventoryItem(inventoryItem), HttpStatus.CREATED);
    }

    @GetMapping
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemService.getAllInventoryItems();
    }

    @GetMapping("{inventoryId}")
    public ResponseEntity<InventoryItem> getInventoryItemById(@PathVariable("inventoryId") int inventoryId) {
        return new ResponseEntity<>(inventoryItemService.getInventoryItemById(inventoryId), HttpStatus.OK);
    }

    @DeleteMapping("{inventoryId}")
    public ResponseEntity<String> deleteInventoryItemById(@PathVariable("inventoryId") int inventoryId) {
        return new ResponseEntity<>(inventoryItemService.deleteInventoryItemById(inventoryId), HttpStatus.OK);
    }

    @PutMapping("{inventoryId}")
    public ResponseEntity<InventoryItem> updateInventoryItemById(@PathVariable("inventoryId") int inventoryId, @RequestBody InventoryItem inventoryItem) {
        return new ResponseEntity<>(inventoryItemService.updateInventoryItemById(inventoryId, inventoryItem), HttpStatus.OK);
    }

    @GetMapping("item/{itemId}")
    public List<InventoryItem> getInventoryItemsByItemId(@PathVariable("itemId") int itemId) {
        return inventoryItemService.getInventoryItemsByItemId(itemId);
    }

   // @GetMapping("supplier/{supplierId}")
   // public List<InventoryItem> getInventoryItemsBySupplierId(@PathVariable("supplierId") int supplierId) {
    //    return inventoryItemService.getInventoryItemsBySupplierId(supplierId);
   // }

    @GetMapping("stock/{stockLevel}")
    public List<InventoryItem> getInventoryItemsByStockLevel(@PathVariable("stockLevel") int stockLevel) {
        return inventoryItemService.getInventoryItemsByStockLevel(stockLevel);
    }

    @GetMapping("minimum/{minimumLevel}")
    public List<InventoryItem> getInventoryItemsByMinimumLevel(@PathVariable("minimumLevel") int minimumLevel) {
        return inventoryItemService.getInventoryItemsByMinimumLevel(minimumLevel);
    }
}
