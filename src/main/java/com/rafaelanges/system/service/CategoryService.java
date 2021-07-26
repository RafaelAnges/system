package com.rafaelanges.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelanges.system.entities.Category;
import com.rafaelanges.system.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
