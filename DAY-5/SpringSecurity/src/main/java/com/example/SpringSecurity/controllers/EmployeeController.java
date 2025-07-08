package com.example.SpringSecurity.controllers;

import com.example.SpringSecurity.models.Employee;
import com.example.SpringSecurity.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}
