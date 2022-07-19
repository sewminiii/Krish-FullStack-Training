package com.sewmini.training.salesmanager.service;

import com.sewmini.training.salesmanager.model.Employee;
import com.sewmini.training.salesmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl(){
        System.out.println("Default constructor executed");
    }

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        System.out.println("Overloaded constructor executed");
        this.employeeRepository = employeeRepository;
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter injection fired");
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

}
