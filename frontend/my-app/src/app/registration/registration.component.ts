import { Component } from '@angular/core';
import { Customer } from '../customer';
import { RegisterService } from '../register.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
  standalone:false
})
export class RegistrationComponent {
  customer : Customer = new Customer(0," "," "," "," "," ");
  
  constructor (private registerService:RegisterService, private router:Router){}


  
  onRegister() {
    this.registerService.register(this.customer).subscribe((response:any)=>{
      alert("Register successfull");
      this.router.navigate(['login']);
    })
  }
  login(){
    this.router.navigate(['login']);
  }
  logout()
  {
    sessionStorage.removeItem("custId");
  }
}
