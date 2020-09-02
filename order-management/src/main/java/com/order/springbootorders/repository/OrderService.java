package com.order.springbootorders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.springbootorders.model.Order;

public interface OrderService extends JpaRepository<Order, Long> {

}
