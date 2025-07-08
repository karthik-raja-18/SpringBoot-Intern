package com.example.SpringSecurity.services;

import com.example.SpringSecurity.models.Employee;
import com.example.SpringSecurity.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Create a new employee
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee added successfully!";
    }

    // Update existing employee
    public String updateEmployee(int id, Employee updatedEmployee) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            Employee emp = optional.get();
            emp.setName(updatedEmployee.getName());
            emp.setDepartment(updatedEmployee.getDepartment());
            emp.setEmail(updatedEmployee.getEmail());
            emp.setSalary(updatedEmployee.getSalary());
            employeeRepository.save(emp);
            return "Employee updated successfully!";
        } else {
            return "Employee not found!";
        }
    }

    // Delete employee by ID
    public String deleteEmployee(int id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully!";
        } else {
            return "Employee not found!";
        }
    }

    // Delete all employees (optional method)
    public String deleteAllEmployees() {
        employeeRepository.deleteAll();
        return "All employees deleted!";
    }
}
