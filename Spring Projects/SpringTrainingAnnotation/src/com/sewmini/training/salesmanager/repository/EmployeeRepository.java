package com.sewmini.training.salesmanager.repository;

import com.sewmini.training.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
