package com.persistencia.prueba.repository;

import com.persistencia.prueba.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
