package com.fnb.orderservice.repository;

import com.fnb.orderservice.entitiy.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryItemRepository extends JpaRepository<InventoryItem,Integer> {
}
