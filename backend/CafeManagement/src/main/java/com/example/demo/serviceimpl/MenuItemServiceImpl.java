package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MenuItem;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    // Injecting the MenuItemRepository to interact with the database
    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @Override
    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @Override
    public MenuItem getMenuItemById(int itemId) {
        Optional<MenuItem> menuItem = menuItemRepository.findById(itemId);
        return menuItem.orElse(null);  
    }

    @Override
    public MenuItem updateMenuItemById(int itemId, MenuItem menuItem) 
    {
        if (menuItemRepository.existsById(itemId))
        {
            menuItem.setItemId(itemId);  // Ensure the ID is set before saving
            return menuItemRepository.save(menuItem);  // Save the updated MenuItem
        }
        return null; 
    }

    @Override
    public String deleteMenuItemById(int itemId) 
    {
        // Check if the MenuItem exists
        if (menuItemRepository.existsById(itemId)) 
        {
            menuItemRepository.deleteById(itemId);  // Delete the MenuItem by ID
            return "MenuItem with ID " + itemId + " deleted successfully";
        }
        return "MenuItem with ID " + itemId + " not found";  // Return a message if not found
    }

//    @Override
//    public List<MenuItem> getMenuItemsByAvailability(boolean isAvailable) {
//        return menuItemRepository.findByIsAvailable(isAvailable);
//    }

    @Override
    public List<MenuItem> getMenuItemsByCategory(String category) {
        return menuItemRepository.findByCategory(category);
    }
}
