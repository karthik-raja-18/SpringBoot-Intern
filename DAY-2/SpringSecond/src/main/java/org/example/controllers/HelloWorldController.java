package org.example.controllers;

import org.example.models.Employee;
import org.example.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService hws;


    @GetMapping("/")
    public List<Employee> getMethod(){
        return hws.getMethod();
    }

    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable  int empId){
        return hws.getEmployeeById(empId);
    }

    @PostMapping("/")
    public String postMethod(@RequestBody Employee emp) {
//        public List<Employee> this will pass the emp list to service;s post method
        return hws.postMethod(emp);
    }

    @PutMapping("/{id}")
    public List<Employee> putMethod(@PathVariable int id, @RequestBody Employee emp) {
        return hws.putMethod(id, emp);
    }




}
