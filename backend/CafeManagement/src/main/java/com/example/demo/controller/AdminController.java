package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.model.Customer;
import com.example.demo.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/CafeData/admins")
@CrossOrigin(origins = "http://localhost:4200/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        return new ResponseEntity<>(adminService.addAdmin(admin), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }
    @PostMapping("/login")
   	public ResponseEntity<Admin> loginAdmin(@RequestBody Admin admin) 
   	{
   		return new ResponseEntity<Admin>(adminService.loginAdmin(admin),HttpStatus.OK);
   	}

    @GetMapping("{adminId}")
    public ResponseEntity<Admin> getAdminById(@PathVariable("adminId") int adminId) {
        return new ResponseEntity<>(adminService.getAdminById(adminId), HttpStatus.OK);
    }

    @PutMapping("{adminId}")
    public ResponseEntity<Admin> updateAdminById(@PathVariable("adminId") int adminId, @RequestBody Admin admin) {
        return new ResponseEntity<>(adminService.updateAdminById(adminId, admin), HttpStatus.OK);
    }

    @DeleteMapping("{adminId}")
    public ResponseEntity<String> deleteAdminById(@PathVariable("adminId") int adminId) {
        return new ResponseEntity<>(adminService.deleteAdminById(adminId), HttpStatus.OK);
    }
}
