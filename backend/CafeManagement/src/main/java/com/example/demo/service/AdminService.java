package com.example.demo.service;

import com.example.demo.model.Admin;

import java.util.List;

public interface AdminService {
    Admin addAdmin(Admin admin);
    List<Admin> getAllAdmins();
    Admin getAdminById(int adminId);
    Admin updateAdminById(int adminId, Admin admin);
    String deleteAdminById(int adminId);
    public Admin loginAdmin(Admin admin);
}
