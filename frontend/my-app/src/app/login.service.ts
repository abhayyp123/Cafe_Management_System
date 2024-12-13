import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
loginUrl="http://localhost:8080/api/CafeData/customers/login";
  constructor(private httpClient:HttpClient) { }

  login(customer:any){
    console.log(customer);
    return this.httpClient.post(`${this.loginUrl}`,customer);
  }
}
