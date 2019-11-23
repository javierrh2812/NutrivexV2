package com.nutrivex.platform.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Role;
import com.nutrivex.platform.app.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Role findRole(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).orElse(null);
	}

}
