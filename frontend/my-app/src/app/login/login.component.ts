import { Component } from '@angular/core';
import { LoginService } from '../login.service';
import { Customer } from '../customer';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  standalone:false
})
export class LoginComponent {
  customer : Customer = new Customer(0," "," "," "," "," ");
customerId:any;
  constructor(private loginService: LoginService, private router:Router){}
  onLogin() {
    console.log(this.customer);
    this.loginService.login(this.customer).subscribe(
      (response:any)=>{
        if(response!=null){
          alert('Login Successful!');
          this.customer=response;
          this.customerId=this.customer.customerId;
          sessionStorage.setItem("custid",this.customerId);
          this.router.navigate(['homepage']);
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
