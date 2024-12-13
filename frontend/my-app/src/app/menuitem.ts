export class MenuItem {
    itemId: number;
    itemName: string;
    category: string;
    description: string;
    price: number;
    ingredients: string;
    // isAvailable: boolean;
  
    constructor(
      itemId: number ,
      itemName: string ,
      category: string ,
      description: string ,
      price: number ,
      ingredients: string ,
      // isAvailable: boolean 
    ) {
      this.itemId = itemId;
      this.itemName = itemName;
      this.category = category;
      this.description = description;
      this.price = price;
      this.ingredients = ingredients;
      // this.isAvailable = isAvailable;
    }
  }
  