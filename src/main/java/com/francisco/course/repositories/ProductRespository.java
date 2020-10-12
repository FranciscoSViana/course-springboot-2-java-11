package com.francisco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.course.entities.Category;
import com.francisco.course.entities.Product;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

}
