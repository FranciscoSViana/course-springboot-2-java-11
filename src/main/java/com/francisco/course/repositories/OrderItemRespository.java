package com.francisco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.francisco.course.entities.OrderItem;
import com.francisco.course.entities.User;

@Repository
public interface OrderItemRespository extends JpaRepository<OrderItem, Long> {

}
