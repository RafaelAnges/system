package com.rafaelanges.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelanges.system.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
