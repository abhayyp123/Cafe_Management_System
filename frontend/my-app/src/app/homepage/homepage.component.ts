import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  standalone: false,
  
  templateUrl: './homepage.component.html',
  styleUrl: './homepage.component.css'
})
export class HomepageComponent {
  constructor(private router: Router) {}

  menu_item() {
     // Adjust path based on your routing setup
    this.router.navigate(['showmenuitem']);
  }
  cafe_staff() {
    // Adjust path based on your routing setup
   this.router.navigate(['cafestaff']);
 }
 inventory() {
  // Adjust path based on your routing setup
 this.router.navigate(['inventory']);
}
report() {
  // Adjust path based on your routing setup
 this.router.navigate(['report']);
}
user_order() {
  // Adjust path based on your routing setup
 this.router.navigate(['order']);
}
}
