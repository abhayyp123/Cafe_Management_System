import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Order } from './order';

@Injectable({
  providedIn: 'root'
})
export class MenuitemService {
  
  paymentURL="http://localhost:8080/api/CafeData/payments/"
  reportURL = "http://localhost:8080/api/CafeInventory/reports/";
  orderURL = "http://localhost:8080/api/CafeData/Orders/";
  inventoryURL = "http://localhost:8080/api/CafeInventory/inventoryitems/";
  showURL = "http://localhost:8080/api/CafeData/menuitems/";
  registerURL = "http://localhost:8080/api/CafeData/menuitems/";
  updateURL = "http://localhost:8080/api/CafeData/menuitems";
  staffURL="http://localhost:8080/api/CafeInventory/Cafe_staff/";
  constructor(private httpClient : HttpClient) { }

  addItem(newMenuItem:any){
    return this.httpClient.post(`${this.registerURL}`, newMenuItem);
  }
  getMenuItems(newMenuItem:any){
    return this.httpClient.get(`${this.registerURL}`, newMenuItem);
  }
  deletemenuitemService(id:number){
    return this.httpClient.delete(`${this.updateURL}/${id}`);
  }
  getMenuItemById(id:number){
    return this.httpClient.get(`${this.updateURL}/${id}`);
  }
  getStaffDetails(staffDetails:any){
return this.httpClient.get(`${this.staffURL}`,staffDetails);
  }
  showMenuItems(newMenuItem:any){
    return this.httpClient.get(`${this.showURL}`, newMenuItem);
  }
  getInventory(inventory:any){
    return this.httpClient.get(`${this.inventoryURL}`, inventory);
  }
  postOrder(customerId:any, itemId:any,order:any){
   
    console.log("service");
    console.log(customerId);
    console.log(itemId);
    return this.httpClient.post(`${this.orderURL}${customerId}/${itemId}`,order);
  }
  report(report:any){
    return this.httpClient.post(`${this.reportURL}`, report)
  }
  getOrder(){
    return this.httpClient.get(`${this.orderURL}`);
  }
  updatemenuitemService(id:any,menuItem:any){
    return this.httpClient.put(`${this.updateURL}/${id}`,menuItem);
  }
  getPayment(){
    return this.httpClient.get(`${this.paymentURL}`);
  }
  getReport(){
    return this.httpClient.get(`${this.reportURL}`);
  }
  // processPayment( totalAmount:number,payment:any){
  //   return this.httpClient.post(`${this.paymentURL}`,totalAmount,payment);
  // }
  addPayment(totalAmount:number,customerId:number,payment:any,message:any){
    return this.httpClient.post(`${this.paymentURL}${totalAmount}/${customerId}/${message}`,payment);
  }
}
