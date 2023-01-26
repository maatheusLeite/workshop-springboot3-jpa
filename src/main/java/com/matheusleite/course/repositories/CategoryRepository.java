package com.matheusleite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusleite.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
