package com.example.demo.service;

import java.util.List;

import com.example.demo.model.MenuItem;

public interface MenuItemService {

    MenuItem addMenuItem(MenuItem menuItem);

    List<MenuItem> getAllMenuItems();

    MenuItem getMenuItemById(int itemId);

    MenuItem updateMenuItemById(int itemId, MenuItem menuItem);

    String deleteMenuItemById(int itemId);

//    List<MenuItem> getMenuItemsByAvailability(boolean isAvailable);

    List<MenuItem> getMenuItemsByCategory(String category);
}
