package com.nutrivex.platform.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	 public User findByUsername(String username);
}
