export class Customer {
    customerId!: number;        // Unique ID of the customer 
    name!: string;             // Customer's name 
    email!: string;            // Customer's email address
    phoneNumber!: string;      // Customer's phone number
    address!: string;          // Customer's address
    password!:string;
   
    constructor(
      customerId: number,
      name: string,
      email: string,
      phoneNumber: string,
      address: string,
      password:string
    ) {
      this.customerId = customerId;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.address = address;
     this.password=password;
    }
  }
  