import { Customer } from './customer';
import { MenuItem } from './menuitem';


export class Payment {
  paymentID: number;
  customerId: number;
  // itemId: number;
  totalAmount: number;
  cardHodler: string;  // Corrected from cardHodler
  cardNumber: string;
  expirationDate: string;
  cvv: number;
  phoneNumber: string;

  constructor(
      paymentID: number,
      customerId: number,
      // itemId: number,
      totalAmount: number,
      cardHodler: string,
      cardNumber: string,
      expirationDate: string,
      cvv: number,
      phoneNumber: string
  ) {
      this.paymentID = paymentID;
      this.customerId = customerId;
      // this.itemId = itemId;
      this.totalAmount = totalAmount;
      this.cardHodler = cardHodler;
      this.cardNumber = cardNumber;
      this.expirationDate = expirationDate;
      this.cvv = cvv;
      this.phoneNumber = phoneNumber;
  }
}