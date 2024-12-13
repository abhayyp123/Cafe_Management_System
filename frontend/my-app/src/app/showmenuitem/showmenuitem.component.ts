import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';
import { Order } from '../order';
@Component({
  selector: 'app-showmenuitem',
  standalone: false,
  
  templateUrl: './showmenuitem.component.html',
  styleUrl: './showmenuitem.component.css'
})
export class ShowmenuitemComponent implements OnInit {
  menuItems: any;  // Array to hold menu items
  customerId:any;
  orderedItems: any[] = [];  // Array to hold ordered items
  totalAmount: number = 0;  // The total amount for all ordered items
  order = new Order(0,"",0,0,0);
  menuItem:any;
  itemId:any;
  
  constructor(private menuitemService: MenuitemService, private router:Router) { }

  ngOnInit(): void {
this.customerId=sessionStorage.getItem("custid"); 
console.log(this.customerId);    // Get customerId from sessionStorage
    this.menuitemService.showMenuItems(this.menuItems).subscribe((data) => {
      this.menuItems = data;  // Store the data from the server in menuItems
    });
   
       /* this.menuitemService.getMenuItemById().subscribe(
        (Response:any)=>
        {
          this.menuItem=Response;
          this.totalAmount+=this.menuItem.price;
          console.log(this.menuItem.price);
          console.log(this.totalAmount);
        }
      )*/
    
    
  }
  orderitem(menuitem:any){
    console.log(menuitem)
    console.log(this.customerId);
    this.order.customerId=this.customerId;
    this.order.itemId=menuitem;
    this.menuitemService.postOrder(this.customerId,menuitem,this.order).subscribe(
      (response: any) => {
        console.log("Order placed successfully");
          console.log(response);
          this.order=response;
          this.totalAmount += this.order.price;

        // You can add further logic here if needed, such as a success message or redirect.
      },
      (error: any) => {
        console.error('Error placing order', error);
      }
    );
    // Add the item to the orderedItems array
    this.orderedItems.push(menuitem);

    // Update the total amount by adding the price of the ordered item
    //this.totalAmount += menuitem.price;

    console.log('Item ordered:');
    console.log(this.orderedItems);
   // console.log('Current total amount:', this.totalAmount);
  
  }
  navigateToHome(){
    this.router.navigate(['homepage']);
  }
  navigatePayment(){
          // Pass the total amount to the payment page
      this.router.navigate(['payment', this.totalAmount,this.customerId]);
    } 
  
}
