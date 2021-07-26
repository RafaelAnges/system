package com.rafaelanges.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelanges.system.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
