import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-inventory',
  standalone: false,
  
  templateUrl: './inventory.component.html',
  styleUrl: './inventory.component.css'
})
export class InventoryComponent implements OnInit{
  inventory:any;
  constructor(private menuitemService:MenuitemService, private router:Router){}
  ngOnInit(): void {
    this.menuitemService.getInventory(this.inventory).subscribe((data) => {
      this.inventory = data;  // Store the data from the server in menuItems
    });
  }
  navigateToHome(){
    this.router.navigate(['adminhomepage']);
  }
  }


