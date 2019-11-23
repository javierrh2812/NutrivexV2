package com.nutrivex.platform.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
