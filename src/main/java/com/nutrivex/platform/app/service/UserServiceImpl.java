package com.nutrivex.platform.app.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.User;
import com.nutrivex.platform.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User findUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public int createUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		return 0;
	}

	
	

}
