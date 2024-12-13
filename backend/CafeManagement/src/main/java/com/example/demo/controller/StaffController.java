package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Staff;
import com.example.demo.service.StaffService;

@RestController
@RequestMapping("api/CafeInventory/Cafe_staff/")
@CrossOrigin(origins = "http://localhost:4200/")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff) {
        return new ResponseEntity<>(staffService.addStaff(staff), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    @GetMapping("{staffId}")
    public ResponseEntity<Staff> getStaffById(@PathVariable("staffId") int staffId) {
        return new ResponseEntity<>(staffService.getStaffById(staffId), HttpStatus.OK);
    }

    @PutMapping("{staffId}")
    public ResponseEntity<Staff> updateStaffById(@PathVariable("staffId") int staffId, @RequestBody Staff staff) {
        return new ResponseEntity<>(staffService.updateStaffById(staffId, staff), HttpStatus.OK);
    }

    @DeleteMapping("{staffId}")
    public ResponseEntity<String> deleteStaffById(@PathVariable("staffId") int staffId) {
        return new ResponseEntity<>(staffService.deleteStaffById(staffId), HttpStatus.OK);
    }
}
