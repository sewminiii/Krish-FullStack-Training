package com.sewmini.training.salesmanager.config;

import com.sewmini.training.salesmanager.repository.EmployeeRepository;
import com.sewmini.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.sewmini.training.salesmanager.service.EmployeeService;
import com.sewmini.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.sewmini")
public class ApplicationConfiguration {
    @Bean(name="employeeService")
    @Scope("singleton")
    public EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return new EmployeeServiceImpl();
    }

    /*@Bean(name="employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }*/
}
