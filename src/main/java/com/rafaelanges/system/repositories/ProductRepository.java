package com.rafaelanges.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelanges.system.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
