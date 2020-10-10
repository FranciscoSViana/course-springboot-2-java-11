package com.francisco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisco.course.entities.User;

public interface UserRespository extends JpaRepository<User, Long> {

}
