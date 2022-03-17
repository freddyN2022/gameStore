package com.persistencia.prueba.service;

import com.persistencia.prueba.entity.Purchase;
import com.persistencia.prueba.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    @Autowired
    PurchaseRepository purchaseRepository;

    public void save(Purchase purchase){
        purchaseRepository.save(purchase);
    }

    public void delete(Purchase purchase){
        purchaseRepository.delete(purchase);
    }
}
