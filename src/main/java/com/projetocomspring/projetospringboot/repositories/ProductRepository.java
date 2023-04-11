package com.projetocomspring.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocomspring.projetospringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
