import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminloginService {
adminloginurl="http://localhost:8080/api/CafeData/admins/login";
  constructor(private httpClient:HttpClient) {}
  login(admin:any){
    return this.httpClient.post(`${this.adminloginurl}`,admin);
  }
   }

