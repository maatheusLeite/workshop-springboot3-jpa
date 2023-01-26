package com.matheusleite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusleite.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
