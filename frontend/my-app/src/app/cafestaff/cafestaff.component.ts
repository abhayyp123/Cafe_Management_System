import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cafestaff',
  standalone: false,
  
  templateUrl: './cafestaff.component.html',
  styleUrl: './cafestaff.component.css'
})
export class CafestaffComponent implements OnInit {
staffDetails:any;
constructor(private menuitemService:MenuitemService, private router:Router){}
ngOnInit(): void {
    this.menuitemService.getStaffDetails(this.staffDetails).subscribe(
      (data) => {
        this.staffDetails=data;
      }
    )
}
navigateToHome(){
  this.router.navigate(['adminhomepage']);
}
}
