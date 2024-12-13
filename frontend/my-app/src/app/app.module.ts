import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { HomepageComponent } from './homepage/homepage.component';
import { AppFooterComponent } from './app-footer/app-footer.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { MenuitemComponent } from './menuitem/menuitem.component';
import { AdminhomepageComponent } from './adminhomepage/adminhomepage.component';
import { DisplaymenuitemComponent } from './displaymenuitem/displaymenuitem.component';
import { UpdatemenuitemComponent } from './updatemenuitem/updatemenuitem.component';
import { AppHeaderComponent } from './app-header/app-header.component';
import { CafestaffComponent } from './cafestaff/cafestaff.component';
import { ShowmenuitemComponent } from './showmenuitem/showmenuitem.component';
import { InventoryComponent } from './inventory/inventory.component';
import { OrderComponent } from './order/order.component';
import { ReportComponent } from './report/report.component';
import { PaymentComponent } from './payment/payment.component';
import { PayComponent } from './pay/pay.component';
import { ShowreportComponent } from './showreport/showreport.component';
import { NgxPaginationModule } from 'ngx-pagination';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    HomepageComponent,
    AppFooterComponent,
    AdminloginComponent,
    MenuitemComponent,
    AdminhomepageComponent,
    DisplaymenuitemComponent,
    UpdatemenuitemComponent,
    AppHeaderComponent,
    CafestaffComponent,
    ShowmenuitemComponent,
    InventoryComponent,
    OrderComponent,
    ReportComponent,
    PaymentComponent,
    PayComponent,
    ShowreportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
