package com.nutrivex.platform.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Users;
import com.nutrivex.platform.app.repository.UsersRepository;
import com.nutrivex.platform.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UsersRepository userRepository;

	@Override
	public Users findUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Users findUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	
	

}
