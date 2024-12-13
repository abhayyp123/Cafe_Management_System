import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-order',
  standalone: false,
  
  templateUrl: './order.component.html',
  styleUrl: './order.component.css'
})
export class OrderComponent implements OnInit{
order:any;
page:number=1;
count:number=5;
constructor(private menuItemService:MenuitemService,private router:Router){}
ngOnInit(): void {
    this.menuItemService.getOrder().subscribe(
      (data) =>{
      
this.order=data;
console.log(this.order);
      }
        );
}
navigateToHome(){
  this.router.navigate(['adminhomepage']);
}

}
