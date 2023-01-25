package com.matheusleite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusleite.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
