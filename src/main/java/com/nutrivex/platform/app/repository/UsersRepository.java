package com.nutrivex.platform.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	 
	public Users findByUsername(String username);
}
