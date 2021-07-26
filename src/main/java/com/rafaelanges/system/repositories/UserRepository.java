package com.rafaelanges.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelanges.system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
