package com.rafaelanges.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelanges.system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
