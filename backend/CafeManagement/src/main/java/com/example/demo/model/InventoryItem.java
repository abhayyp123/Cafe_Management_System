			package com.example.demo.model;
			
			import jakarta.persistence.Column;
			import jakarta.persistence.Entity;
			import jakarta.persistence.GeneratedValue;
			import jakarta.persistence.GenerationType;
			import jakarta.persistence.Id;
			import jakarta.persistence.JoinColumn;
			import jakarta.persistence.ManyToOne;
			import jakarta.persistence.OneToOne;
			import jakarta.persistence.Table;
			
			@Entity
			@Table(name = "inventory")
			public class InventoryItem {
			
			    @Id
			    @GeneratedValue(strategy = GenerationType.IDENTITY)
			    @Column(name = "inventory_id")  
			    private int inventoryId;
			
			    @Column(name = "stock_level")  
			    private int stockLevel;
			
			    @Column(name = "minimum_level")  
			    private int minimumLevel;
			
			    @Column(name = "reorder_quantity")  
			    private int reorderQuantity;
			
			    @Column(name = "unit_cost")  
			    private double unitCost;
			    
			    @OneToOne
			    @JoinColumn(name = "itemId",referencedColumnName="item_id")  
			    private MenuItem menuItem;
			
			    // Getters and setters
			    public int getInventoryId() {
			        return inventoryId;
			    }
			
			    public void setInventoryId(int inventoryId) {
			        this.inventoryId = inventoryId;
			    }
			
			
			    public int getStockLevel() {
			        return stockLevel;
			    }
			
			    public void setStockLevel(int stockLevel) {
			        this.stockLevel = stockLevel;
			    }
			
			    public int getMinimumLevel() {
			        return minimumLevel;
			    }
			
			    public void setMinimumLevel(int minimumLevel) {
			        this.minimumLevel = minimumLevel;
			    }
			
			    public int getReorderQuantity() {
			        return reorderQuantity;
			    }
			
			    public void setReorderQuantity(int reorderQuantity) {
			        this.reorderQuantity = reorderQuantity;
			    }
			
			    public double getUnitCost() {
			        return unitCost;
			    }
			
			    public void setUnitCost(double unitCost) {
			        this.unitCost = unitCost;
			    }
			    
			
			    public MenuItem getMenuItem() {
					return menuItem;
				}
			
				public void setMenuItem(MenuItem menuItem) {
					this.menuItem = menuItem;
				}
				 // Method to access the customerId directly from the associated Customer object
			    public int getitemIdFromInventory() {
			        if (this.menuItem != null) {
			            return this.menuItem.getItemId();  // Accessing customerId from Customer object
			        }
			        return -1;  // If no customer associated, you can return a default value or handle it as needed
			    }
			
				@Override
				public String toString() {
					return "InventoryItem [inventoryId=" + inventoryId + ", stockLevel=" + stockLevel + ", minimumLevel="
							+ minimumLevel + ", reorderQuantity=" + reorderQuantity + ", unitCost=" + unitCost + ", menuItem="
							+ menuItem + "]";
				}
				
			}
