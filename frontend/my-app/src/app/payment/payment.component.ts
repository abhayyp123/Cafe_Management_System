import { Component, OnInit } from '@angular/core';
import { Order } from '../order';
import { ActivatedRoute, Router } from '@angular/router';
import { MenuitemService } from '../menuitem.service';
import { Payment } from '../payment';

@Component({
  selector: 'app-payment',
  standalone: false,
  
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css'
})
export class PaymentComponent  implements OnInit {
  payment:Payment= new Payment(0,0,0,"","","",0,"");
  creditOption:boolean=false;
  paypal:boolean=false;
  debit:boolean=false;
  selectedItem:any;
  totalAmount: number = 0;  // The total amount for the order
customerId:number=0;

  constructor(private router: Router,private activatedRoute:ActivatedRoute,private menuitemService:MenuitemService) {}

  ngOnInit(): void {
    this.totalAmount=this.activatedRoute.snapshot.params['totalAmount'];
    this.customerId=this.activatedRoute.snapshot.params['customerId'];
    // Retrieve the totalAmount passed via the router state
    /*const navigation = this.router.getCurrentNavigation();
    if (navigation?.extras?.state?.['totalAmount']) {
      this.totalAmount = navigation.extras.state?.['totalAmount'];
    } else {
      // If no totalAmount is available, redirect to menu page
      alert('No items ordered! Redirecting to menu.');
      this.router.navigate(['showmenuitem']);
    }*/
// this.menuitemService.processPayment(this.totalAmount,this.payment).subscribe( 
//   (data:any) =>{
//     alert("payment successfull");
//   }

// )
}
optionChange(event:any){

console.log(event.target.value)
  if(event.target.value=="creditCard")
  {
    this.creditOption=true; 
    this.paypal=false;
    this.debit=false;
  }else if(event.target.value=="paypal")
  {
    this.creditOption=false; 
      this.paypal=true;
      this.debit=false;
    }else
    {
      this.creditOption=false; 
      this.paypal=false;
      this.debit=true;
    }
  

}
processPayment0(){
  
}
processPayment(message:any){
console.log(message);
  this.menuitemService.addPayment(this.totalAmount,this.customerId,this.payment,message).subscribe(
    (data:any) =>{
      alert("payment successful")
      this.router.navigate(['showmenuitem']);
    }
    
  )

}
processPayment1(message:any)
{
  console.log(message);
  this.menuitemService.addPayment(this.totalAmount,this.customerId,this.payment,message).subscribe(
    (data:any) =>{
      alert("payment successful")
      this.router.navigate(['showmenuitem']);
    }
    
  )
}
processPayment2(message:any){
  console.log(message);
  this.menuitemService.addPayment(this.totalAmount,this.customerId,this.payment,message).subscribe(
    (data:any) =>{
      alert("payment successful")
      this.router.navigate(['showmenuitem']);
    }
    
  )
}

}