package com.employee.employee_spring.service;

import com.employee.employee_spring.model.Employee;
import com.employee.employee_spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}