import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

registerURL = "http://localhost:8080/api/CafeData/customers";

  constructor(private httpClient : HttpClient) { }

  register(newCustomer:any){
    return this.httpClient.post(`${this.registerURL}`, newCustomer);
  }

}
