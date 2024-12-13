//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.demo.model.Supplier;
//import com.example.demo.service.SupplierService;
//
//@RestController
//@RequestMapping("api/CafeInventory/suppliers/")
//public class SupplierController {
//
//    @Autowired
//    private SupplierService supplierService;
//
//    @PostMapping
//    public ResponseEntity<Supplier> addSupplier(@RequestBody Supplier supplier) {
//        return new ResponseEntity<>(supplierService.addSupplier(supplier), HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public List<Supplier> getAllSuppliers() {
//        return supplierService.getAllSuppliers();
//    }
//
//    @GetMapping("{supplierId}")
//    public ResponseEntity<Supplier> getSupplierById(@PathVariable("supplierId") int supplierId) {
//        return new ResponseEntity<>(supplierService.getSupplierById(supplierId), HttpStatus.OK);
//    }
//
//    @PutMapping("{supplierId}")
//    public ResponseEntity<Supplier> updateSupplierById(@PathVariable("supplierId") int supplierId, @RequestBody Supplier supplier) {
//        return new ResponseEntity<>(supplierService.updateSupplierById(supplierId, supplier), HttpStatus.OK);
//    }
//
//    @DeleteMapping("{supplierId}")
//    public ResponseEntity<String> deleteSupplierById(@PathVariable("supplierId") int supplierId) {
//        return new ResponseEntity<>(supplierService.deleteSupplierById(supplierId), HttpStatus.OK);
//    }
//}
