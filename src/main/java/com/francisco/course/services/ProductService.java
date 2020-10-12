package com.francisco.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francisco.course.entities.Product;
import com.francisco.course.repositories.ProductRespository;

@Service
public class ProductService {

	@Autowired
	private ProductRespository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
