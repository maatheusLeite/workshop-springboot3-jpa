package com.matheusleite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusleite.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
