import { Customer } from './customer';
import { MenuItem } from './menuitem';

export class Order {
  orderId: number;
  orderDate: string;
  customerId: number;
  itemId:number;
  price:number;

  // Constructor to initialize the Order model
  constructor(
    orderId: number,
    orderDate: string,
   customerId:number,
   itemId:number,
   price:number
  ) {
    this.orderId = orderId;
    this.orderDate = orderDate;
    this.customerId =customerId;
    this.itemId = itemId;
    this.price=price;
  }

  
}
