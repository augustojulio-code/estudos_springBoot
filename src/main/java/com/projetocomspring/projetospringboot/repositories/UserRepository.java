package com.projetocomspring.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocomspring.projetospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
