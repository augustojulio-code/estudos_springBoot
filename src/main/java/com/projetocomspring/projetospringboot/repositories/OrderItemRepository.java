package com.projetocomspring.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocomspring.projetospringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
