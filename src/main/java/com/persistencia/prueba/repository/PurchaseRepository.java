package com.persistencia.prueba.repository;

import com.persistencia.prueba.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, String> {
}
