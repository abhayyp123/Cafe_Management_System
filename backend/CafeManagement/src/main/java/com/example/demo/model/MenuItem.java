package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu_item")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")  
    private int itemId;

    @Column(name = "item_name")  
    private String itemName;

    @Column(name = "category")  
    private String category;

    @Column(name = "description")  
    private String description;

    @Column(name = "price")  
    private double price;

    @Column(name = "ingredients") 
    private String ingredients;

//    @Column(name = "is_available")
//    private boolean isAvailable;

    // Getters and setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

	@Override
	public String toString() {
		return "MenuItem [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", description="
				+ description + ", price=" + price + ", ingredients=" + ingredients + "]";
	}

//    public boolean isAvailable() {
//        return isAvailable;
//    }
//
//    public void setAvailable(boolean isAvailable) {
//        this.isAvailable = isAvailable;
//    }

   
}