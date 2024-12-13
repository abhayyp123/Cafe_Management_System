import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MenuitemService } from '../menuitem.service';

@Component({
  selector: 'app-updatemenuitem',
  standalone: false,
  
  templateUrl: './updatemenuitem.component.html',
  styleUrl: './updatemenuitem.component.css'
})
export class UpdatemenuitemComponent implements OnInit{
  menuItemId:any;
  menuItem:any;
  constructor( private router:Router, private route:ActivatedRoute, private menuItemService:MenuitemService){}
   ngOnInit(): void {
      this.menuItemId=this.route.snapshot.params['id'];
      this.menuItemService.getMenuItemById(this.menuItemId).subscribe(
        (response:any) => {
this.menuItem=response;
      },
      (error: any) => {
        // Handle errors (e.g., item not found or server issues)
        console.error('Error fetching menu item:', error);
        alert('Menu item not found or there was an error fetching the item.');
      }
      
      );
   }
   onSubmit(){
   

   }
   navigateToHome(){
    this.router.navigate(['displaymenuitem']);
  }
  update(id:number){
    this.menuItemService.updatemenuitemService(id,this.menuItem).subscribe(
      (data) => {
        console.log("Success", data); // Successful updation
        // Optionally, redirect to another page or show a success message
       alert("update successful")
      },
    );
  }
}
