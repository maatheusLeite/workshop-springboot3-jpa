package com.matheusleite.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusleite.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
