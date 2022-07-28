package com.sewmini.rentcloud.profileservice.repository;

import com.sewmini.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
