package com.example.demo.serviceimpl;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getAdminById(int adminId) {
        return adminRepository.findById(adminId).orElse(null);
    }

    @Override
    public Admin updateAdminById(int adminId, Admin admin) {
        if (adminRepository.existsById(adminId)) {
            admin.setAdminId(adminId);
            return adminRepository.save(admin);
        }
        return null;
    }

    @Override
    public String deleteAdminById(int adminId) {
        if (adminRepository.existsById(adminId)) {
            adminRepository.deleteById(adminId);
            return "Admin with ID " + adminId + " deleted successfully";
        }
        return "Admin with ID " + adminId + " not found";
    }

	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.findByUsernameAndPassword(admin.getUsername(),admin.getPassword());
	}
}
