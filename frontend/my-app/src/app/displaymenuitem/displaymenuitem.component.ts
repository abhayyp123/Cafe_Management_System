import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-displaymenuitem',
  standalone: false,
  
  templateUrl: './displaymenuitem.component.html',
  styleUrl: './displaymenuitem.component.css'
})
export class DisplaymenuitemComponent implements OnInit {
  menuItems: any;  // Array to hold menu items
  page:number=1;
  count:number=5;
  constructor(private menuitemService: MenuitemService, private router:Router, private activatedroute:ActivatedRoute) { }

  ngOnInit(): void {
    this.menuitemService.getMenuItems(this.menuItems).subscribe((data) => {
      this.menuItems = data;  // Store the data from the server in menuItems
    });
  }

  updatemenuitem(id:number)
  {
    this.router.navigate(['updatemenuitem',id]);
    
   
  }
  deletemenuitem(id: number) {
    this.menuitemService.deletemenuitemService(id).subscribe(
      data => {
        console.log("Success", data); // Successful deletion
        // Optionally, redirect to another page or show a success message
       
      },
      error => {
        console.error("Error occurred while deleting the menu item", error); // Handle errors
      }
    );
  }
  
  navigateToHome(){
    this.router.navigate(['adminhomepage']);
    }
}
