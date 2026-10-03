package com.employee.employee_spring;

import com.employee.employee_spring.model.Employee;
import com.employee.employee_spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // GET - All Employees from MySQL
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // POST - Add new Employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // GET - Welcome message
    @GetMapping("/hello")
    public String hello() {
        return "Employee API Working Varalakshmi!";
    }
}