import { Component } from '@angular/core';
import { MenuItem } from '../menuitem';
import { Router } from '@angular/router';
import { MenuitemService } from '../menuitem.service';

@Component({
  selector: 'app-menuitem',
  standalone: false,
  
  templateUrl: './menuitem.component.html',
  styleUrl: './menuitem.component.css'
})
export class MenuitemComponent {
menuItem:MenuItem=new MenuItem(0," "," "," ",0," ");
constructor(private menuitemService:MenuitemService, private router:Router){}
onSubmit() {
  this.menuitemService.addItem(this.menuItem).subscribe((response:any)=>{
    alert("MenuItems have added successfully");
  });
}
navigateToHome(){
  this.router.navigate(['adminhomepage']);
}
}
