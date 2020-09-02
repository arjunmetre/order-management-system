package com.order.springbootorders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.springbootorders.model.Order;
import com.order.springbootorders.repository.OrderService;


@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    ResponseEntity<List<Order>> getOrders(){
        return new ResponseEntity<List<Order>>((List<Order>) orderService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Order> saveOrder(@RequestBody Order orders){
        return new ResponseEntity<Order>(orderService.save(orders), HttpStatus.OK);
    }
}
