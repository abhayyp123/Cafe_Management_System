//package com.example.demo.model;
//
//import jakarta.persistence.*;
//import java.util.List;
//@Entity
//@Table(name = "suppliers")
//public class Supplier {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "supplier_id")
//    private int supplierId;
//
//    @Column(name = "supplier_name")
//    private String supplierName;
//
//    @Column(name = "contact_name")
//    private String contactName;
//
//    @Column(name = "phone_number")
//    private String phoneNumber;
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "address")
//    private String address;
//
//    @Column(name = "lead_time")
//    private int leadTime;
//
//    @Column(name = "payment_terms")
//    private String paymentTerms;
//
//    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<InventoryItem> supplyItems; // Relationship to InventoryItem
//
//    // Getters and setters
//    public int getSupplierId() {
//        return supplierId;
//    }
//
//    public void setSupplierId(int supplierId) {
//        this.supplierId = supplierId;
//    }
//
//    public String getSupplierName() {
//        return supplierName;
//    }
//
//    public void setSupplierName(String supplierName) {
//        this.supplierName = supplierName;
//    }
//
//    public String getContactName() {
//        return contactName;
//    }
//
//    public void setContactName(String contactName) {
//        this.contactName = contactName;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getLeadTime() {
//        return leadTime;
//    }
//
//    public void setLeadTime(int leadTime) {
//        this.leadTime = leadTime;
//    }
//
//    public String getPaymentTerms() {
//        return paymentTerms;
//    }
//
//    public void setPaymentTerms(String paymentTerms) {
//        this.paymentTerms = paymentTerms;
//    }
//
//    public List<InventoryItem> getSupplyItems() {
//        return supplyItems;
//    }
//
//    public void setSupplyItems(List<InventoryItem> supplyItems) {
//        this.supplyItems = supplyItems;
//    }
//
//    @Override
//    public String toString() {
//        return "Supplier{" +
//                "supplierId=" + supplierId +
//                ", supplierName='" + supplierName + '\'' +
//                ", contactName='" + contactName + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", email='" + email + '\'' +
//                ", address='" + address + '\'' +
//                ", leadTime=" + leadTime +
//                ", paymentTerms='" + paymentTerms + '\'' +
//                '}';
//    }
//}
