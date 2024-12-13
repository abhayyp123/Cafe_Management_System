import { MenuItem } from './menuitem';

export class InventoryItem {
  inventoryId: number;
  stockLevel: number;
  minimumLevel: number;
  reorderQuantity: number;
  unitCost: number;
  menuItem: MenuItem;

  constructor(
    inventoryId: number = 0,
    stockLevel: number = 0,
    minimumLevel: number = 0,
    reorderQuantity: number = 0,
    unitCost: number = 0.0,
    menuItem: MenuItem = new MenuItem(0)
  ) {
    this.inventoryId = inventoryId;
    this.stockLevel = stockLevel;
    this.minimumLevel = minimumLevel;
    this.reorderQuantity = reorderQuantity;
    this.unitCost = unitCost;
    this.menuItem = menuItem;
  }
}
