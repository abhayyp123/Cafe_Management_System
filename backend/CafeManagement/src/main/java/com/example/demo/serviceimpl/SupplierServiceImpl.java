//package com.example.demo.serviceimpl;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Supplier;
//import com.example.demo.repository.SupplierRepository;
//import com.example.demo.service.SupplierService;
//
//@Service
//public class SupplierServiceImpl implements SupplierService {
//
//    @Autowired
//    private SupplierRepository supplierRepository;
//
//    @Override
//    public Supplier addSupplier(Supplier supplier) {
//        return supplierRepository.save(supplier);
//    }
//
//    @Override
//    public List<Supplier> getAllSuppliers() {
//        return supplierRepository.findAll();
//    }
//
//    @Override
//    public Supplier getSupplierById(int supplierId) {
//        Optional<Supplier> supplier = supplierRepository.findById(supplierId);
//        return supplier.orElse(null);
//    }
//
//    @Override
//    public Supplier updateSupplierById(int supplierId, Supplier supplier) {
//        if (supplierRepository.existsById(supplierId)) {
//            supplier.setSupplierId(supplierId);
//            return supplierRepository.save(supplier);
//        }
//        return null;
//    }
//
//    @Override
//    public String deleteSupplierById(int supplierId) {
//        if (supplierRepository.existsById(supplierId)) {
//            supplierRepository.deleteById(supplierId);
//            return "Supplier with ID " + supplierId + " deleted successfully";
//        }
//        return "Supplier with ID " + supplierId + " not found";
//    }
//}
