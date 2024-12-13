export class Admin {
    adminId: number;
    username: string;
    password: string;
    email: string;
    phoneNumber: string;
    lastLogin: string; // Or 'Date' if you want to handle it as a Date object
  
    constructor(
      adminId: number,
      username: string ,
      password: string ,
      email: string ,
      phoneNumber: string ,
      lastLogin: string , // If you are using 'Date', this should be a Date object
    ) {
      this.adminId = adminId;
      this.username = username;
      this.password = password;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.lastLogin = lastLogin;
    }
  }
  