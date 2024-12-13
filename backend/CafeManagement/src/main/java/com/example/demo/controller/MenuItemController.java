package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.MenuItem;
import com.example.demo.service.MenuItemService;

@RestController
@RequestMapping("api/CafeData/menuitems/")
@CrossOrigin(origins = "http://localhost:4200/")
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @PostMapping
    public ResponseEntity<MenuItem> addMenuItem(@RequestBody MenuItem menuItem) {
        return new ResponseEntity<>(menuItemService.addMenuItem(menuItem), HttpStatus.CREATED);
    }

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }

    @GetMapping("{itemId}")
    public ResponseEntity<MenuItem> getMenuItemById(@PathVariable("itemId") int itemId) {
        return new ResponseEntity<>(menuItemService.getMenuItemById(itemId), HttpStatus.OK);
    }

    @DeleteMapping("{itemId}")
    public ResponseEntity<String> deleteMenuItemById(@PathVariable("itemId") int itemId) {
        return new ResponseEntity<>(menuItemService.deleteMenuItemById(itemId), HttpStatus.OK);
    }

    @PutMapping("{itemId}")
    public ResponseEntity<MenuItem> updateMenuItemById(@PathVariable("itemId") int itemId, @RequestBody MenuItem menuItem) {
        return new ResponseEntity<>(menuItemService.updateMenuItemById(itemId, menuItem), HttpStatus.OK);
    }
//    @GetMapping("availability/{isAvailable}")
//    public List<MenuItem> getMenuItemsByAvailability(@PathVariable("isAvailable") boolean isAvailable) {
//        return menuItemService.getMenuItemsByAvailability(isAvailable);
//    }

    @GetMapping("category/{category}")
    public List<MenuItem> getMenuItemsByCategory(@PathVariable("category") String category) {
        return menuItemService.getMenuItemsByCategory(category);
    }
}
