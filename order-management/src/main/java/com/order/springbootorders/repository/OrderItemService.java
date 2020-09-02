package com.order.springbootorders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.springbootorders.model.OrderItems;

public interface OrderItemService extends JpaRepository<OrderItems, Long> {

}
