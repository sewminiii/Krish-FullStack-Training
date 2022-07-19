package com.sewmini.training.salesmanager.repository;

import com.sewmini.training.salesmanager.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("repo")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setEmployeeName("Sewmini");
        employee.setEmployeeLocation("Kaluthara");
        employees.add(employee);
        return employees;
    }

}
