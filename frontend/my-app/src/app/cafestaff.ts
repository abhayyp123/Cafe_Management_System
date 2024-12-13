export class Staff {
    staffId: number;
    name: string;
    role: string;
    phoneNumber: string;
    email: string;
    shiftTiming: string;
    salary: number;
    dateJoined: string; // Use string if you're handling the date as a string (ISO format)
  
    // Constructor to initialize the object
    constructor(
      staffId: number,
      name: string,
      role: string,
      phoneNumber: string,
      email: string,
      shiftTiming: string,
      salary: number,
      dateJoined: string
    ) {
      this.staffId = staffId;
      this.name = name;
      this.role = role;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.shiftTiming = shiftTiming;
      this.salary = salary;
      this.dateJoined = dateJoined;
    }
  
    // You can also define any helper methods or getters/setters if necessary
  }
  