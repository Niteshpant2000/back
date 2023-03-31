package com.wissen.supermarket.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.supermarket.employee.Employee;
import com.wissen.supermarket.repository.EmployeeRepository;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    // get Employees
    public List<Employee> getAllEmployee(){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    // add Employees
    public void addEmployee(Employee cashier){
        employeeRepository.save(cashier);
    }

    // remove Employees
    public String removeEmployee(String id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            employeeRepository.deleteById(id);
            return "removed employee successfully.";
        }
        return "unable to find the employee"; 
    }

    // update Employees
    public String updateEmployee(Employee employeeObj){
        Optional<Employee> employee=employeeRepository.findById(employeeObj.getId());
        if(employee.isPresent()){
            Employee employeeToUpdate=employee.get();
            employeeToUpdate.setName(employeeObj.getName());
            employeeToUpdate.setEmail(employeeObj.getEmail());
            employeeToUpdate.setAge(employeeObj.getAge());
            employeeToUpdate.setWorkTimings(employeeObj.getWorkTimings());
            employeeToUpdate.setSalary(employeeObj.getSalary());
            employeeToUpdate.setDesignation(employeeObj.getDesignation());
            employeeRepository.save(employeeToUpdate);
            return "employee details have been updated successfully.";
        }
        else{
            return "employee could not be found.";
        }
    }
}