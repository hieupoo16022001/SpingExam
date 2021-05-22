package com.example.hieu.service;

import com.example.hieu.entity.EmployeeEntity;
import com.example.hieu.respository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity p) {
        return employeeRepo.save(p);
    }

    @Override
    public void deleteProduct(int id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public EmployeeEntity updateProduct(EmployeeEntity p) {
        return employeeRepo.save(p);
    }

    @Override
    public List<EmployeeEntity> getProductByName(String name) {
        List<EmployeeEntity>list = employeeRepo.findProductByName(name);
        return list;
    }

    @Override
    public Optional<EmployeeEntity> findUserById(int id) {
        return employeeRepo.findById(id);
    }
}
