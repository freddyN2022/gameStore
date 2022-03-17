package com.persistencia.prueba.controller;

import com.persistencia.prueba.dto.MensajeDTO;
import com.persistencia.prueba.entity.Customer;
import com.persistencia.prueba.entity.Order;
import com.persistencia.prueba.entity.Purchase;
import com.persistencia.prueba.service.CustomerService;
import com.persistencia.prueba.service.OrderService;
import com.persistencia.prueba.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gamestore")
@CrossOrigin(origins = "*")
public class GameStoreController {

    @Autowired
    PurchaseService purchaseService;

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    @PostMapping("/savePurchase")
    public ResponseEntity<MensajeDTO> savePurchase(@RequestBody Purchase purchase){
        purchaseService.save(purchase);
        return new ResponseEntity<>(new MensajeDTO("Se ha guardado la compra"), HttpStatus.OK);
    }

    @PostMapping("/saveOrder")
    public ResponseEntity<MensajeDTO> saveOrder(@RequestBody Order order){
        orderService.save(order);
        return new ResponseEntity<>(new MensajeDTO("Se ha guardado la orden"), HttpStatus.OK);
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<MensajeDTO> saveCustomer(@RequestBody Customer customer){
        customerService.save(customer);
        return new ResponseEntity<>(new MensajeDTO("Se ha guardado el cliente"), HttpStatus.OK);
    }

    @DeleteMapping("/deletePurchase")
    public ResponseEntity<MensajeDTO> deletePurchase(@RequestBody Purchase purchase){
        purchaseService.delete(purchase);
        return new ResponseEntity<>(new MensajeDTO("Se ha eliminado la compra"), HttpStatus.OK);
    }

    @DeleteMapping("/deleteOrder")
    public ResponseEntity<MensajeDTO> deleteOrder(@RequestBody Order order){
        orderService.delete(order);
        return new ResponseEntity<>(new MensajeDTO("Se ha eliminado la orden"), HttpStatus.OK);
    }

    @DeleteMapping("/deleteCustomer")
    public ResponseEntity<MensajeDTO> deleteCustomer(@RequestBody Customer customer){
        customerService.delete(customer);
        return new ResponseEntity<>(new MensajeDTO("Se ha eliminado el cliente"), HttpStatus.OK);
    }
}
