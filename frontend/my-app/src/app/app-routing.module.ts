import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminhomepageComponent } from './adminhomepage/adminhomepage.component';
import { MenuitemComponent } from './menuitem/menuitem.component';
import { DisplaymenuitemComponent } from './displaymenuitem/displaymenuitem.component';
import { UpdatemenuitemComponent } from './updatemenuitem/updatemenuitem.component';
import { CafestaffComponent } from './cafestaff/cafestaff.component';
import { ShowmenuitemComponent } from './showmenuitem/showmenuitem.component';
import { InventoryComponent } from './inventory/inventory.component';
import { OrderComponent } from './order/order.component';
import { ReportComponent } from './report/report.component';
import { PaymentComponent } from './payment/payment.component';
import { PayComponent } from './pay/pay.component';
import { ShowreportComponent } from './showreport/showreport.component';

const routes: Routes = [
  { path: "", component: RegistrationComponent },
  { path: 'login', component: LoginComponent },
  {path:'homepage',component:HomepageComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'adminhomepage',component:AdminhomepageComponent}, // Default to Login page
  {path:'menuitem',component:MenuitemComponent},
  {path:'displaymenuitem',component:DisplaymenuitemComponent},
  {path:'updatemenuitem/:id',component:UpdatemenuitemComponent},
  {path:'cafestaff',component:CafestaffComponent},
  {path:'showmenuitem',component:ShowmenuitemComponent},
  {path:'inventory',component:InventoryComponent},
  {path:'order',component:OrderComponent},
  {path:'report',component:ReportComponent},
  {path:'payment/:totalAmount/:customerId',component:PaymentComponent},
{path:'pay',component:PayComponent},
{path:'showreport',component:ShowreportComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
