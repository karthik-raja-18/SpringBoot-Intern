package org.example.services;

import org.example.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {

    List<Employee> emp = new ArrayList<>(
            Arrays.asList(
                    new Employee(1,"prasanth","Trainner"),
                    new Employee(2,"Yuvaraj","Faculty"))
            );

    public List<Employee> getMethod(){
        return emp;
    }

    public Employee getEmployeeById(int empId){
        int index = 0;
        boolean flag = false;
        for(int i=0;i<emp.size();i++){
            if(empId == emp.get(i).getEmpId()){
                System.out.println("Emp id : "+emp.get(i).getEmpId()+emp.get(i));
                index = i;
                flag = true;
            }
        }
        if(flag) return emp.get(index);
        else return new Employee();
    }
    public String postMethod(Employee newEmployee) { //List<Employee>

        emp.add(newEmployee);
//      return emp; this will return the employee details as list
        return "Employee added successfully";

    }
    public List<Employee> putMethod(int id, Employee updatedEmp) {
        for (Employee e : emp) {
            if (e.getEmpId() == id) {
                e.setName(updatedEmp.getName());
                e.setJob(updatedEmp.getJob());
                break;
            }
        }
        return emp;
    }



}
