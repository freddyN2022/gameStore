package com.persistencia.prueba.service;

import com.persistencia.prueba.entity.Order;
import com.persistencia.prueba.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void save(Order order){
        orderRepository.save(order);
    }

    public void delete(Order order){
        orderRepository.delete(order);
    }
}
