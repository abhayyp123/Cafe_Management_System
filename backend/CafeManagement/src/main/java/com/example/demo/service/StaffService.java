package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Staff;

public interface StaffService {

    Staff addStaff(Staff staff);

    List<Staff> getAllStaff();

    Staff getStaffById(int staffId);

    Staff updateStaffById(int staffId, Staff staff);

    String deleteStaffById(int staffId);
}
