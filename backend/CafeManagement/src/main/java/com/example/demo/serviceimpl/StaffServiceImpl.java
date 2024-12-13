package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Staff;
import com.example.demo.repository.StaffRepository;
import com.example.demo.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @Override
    public Staff getStaffById(int staffId) {
        Optional<Staff> staff = staffRepository.findById(staffId);
        return staff.orElse(null);
    }

    @Override
    public Staff updateStaffById(int staffId, Staff staff) {
        if (staffRepository.existsById(staffId)) {
            staff.setStaffId(staffId);
            return staffRepository.save(staff);
        }
        return null;
    }

    @Override
    public String deleteStaffById(int staffId) {
        if (staffRepository.existsById(staffId)) {
            staffRepository.deleteById(staffId);
            return "Staff with ID " + staffId + " deleted successfully";
        }
        return "Staff with ID " + staffId + " not found";
    }
}
