package com.projetocomspring.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocomspring.projetospringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long >{

}
