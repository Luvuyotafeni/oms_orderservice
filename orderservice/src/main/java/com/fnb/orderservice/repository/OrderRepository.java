package com.fnb.orderservice.repository;

import com.fnb.orderservice.entitiy.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderItem,Integer> {
}
