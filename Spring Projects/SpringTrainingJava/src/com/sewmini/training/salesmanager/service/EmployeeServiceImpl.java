package com.sewmini.training.salesmanager.service;

import com.sewmini.training.salesmanager.model.Employee;
import com.sewmini.training.salesmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        System.out.println("overloaded constructor executed ");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeServiceImpl(){
        System.out.println("default constructor executed ");
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("setter executed ");
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

}
