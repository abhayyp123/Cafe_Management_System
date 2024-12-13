import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pay',
  standalone: false,
  
  templateUrl: './pay.component.html',
  styleUrl: './pay.component.css'
})
export class PayComponent implements OnInit{
  payment:any;
  constructor(private menuItemService:MenuitemService,private router:Router){}
  ngOnInit(): void {
      this.menuItemService.getPayment().subscribe(
        (data:any) =>{
        
  this.payment=data;
  console.log(this.payment);
        }
          );
  }
  navigateToHome(){
    this.router.navigate(['adminhomepage']);
  }
}
