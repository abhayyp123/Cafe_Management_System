import { Component, OnInit } from '@angular/core';
import { MenuitemService } from '../menuitem.service';
import { Router } from '@angular/router';
import { Report } from '../report';
@Component({
  selector: 'app-report',
  standalone: false,
  
  templateUrl: './report.component.html',
  styleUrl: './report.component.css'
})
export class ReportComponent  {
  report:Report=new Report(0," "," "," "," ");
  constructor(private menuitemService:MenuitemService, private router:Router){}
  onReport(){
  this.menuitemService.report(this.report).subscribe(
    (response:any) =>{
     alert("thank you for your feedback");
    }
  )
  
 
    this.router.navigate(['homepage']);
  }
}
