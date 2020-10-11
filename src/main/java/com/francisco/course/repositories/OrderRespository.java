package com.francisco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.course.entities.Order;

@Repository
public interface OrderRespository extends JpaRepository<Order, Long> {

}
