import { Component } from '@angular/core';
import { Admin } from '../admin';
import { AdminloginService } from '../adminlogin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminlogin',
  standalone: false,
  
  templateUrl: './adminlogin.component.html',
  styleUrl: './adminlogin.component.css'
})
export class AdminloginComponent {
  admin:Admin=new Admin(0," "," "," "," "," ");
  constructor(private adminloginservice:AdminloginService,private router:Router){}
  onLogin() {
    this.adminloginservice.login(this.admin).subscribe(
      (response:any)=>{
        if(response!=null){
          alert('Login Successful!');
          this.router.navigate(['adminhomepage']);
        }
        else{
          alert("invalid"+response);
        }
      },(error)=>{
        alert('an occurred during login');
            }      
      );
    }

}
