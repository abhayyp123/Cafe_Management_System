import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showreport',
  standalone: false,
  
  templateUrl: './showreport.component.html',
  styleUrl: './showreport.component.css'
})
export class ShowreportComponent implements OnInit{
  report: any;  // Array to hold menu items
  constructor(private menuitemService: MenuitemService, private router:Router) { }

  ngOnInit(): void {
    this.menuitemService.getReport().subscribe((data:any) => {
      this.report = data;  // Store the data from the server in menuItems
    });
  } navigateToHome(){
    this.router.navigate(['adminhomepage']);
    }
}
