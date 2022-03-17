package com.persistencia.prueba.repository;

import com.persistencia.prueba.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
