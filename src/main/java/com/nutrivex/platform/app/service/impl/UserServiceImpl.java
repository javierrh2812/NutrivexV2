package com.nutrivex.platform.app.service.impl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.User;
import com.nutrivex.platform.app.repository.UserRepository;
import com.nutrivex.platform.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User findUser(String username) {
		User user = userRepository.findByUsername(username);
		
		if (user == null) return null;
		else return user;
	}

	@Override
	public User findUser(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public int createUser(User user) {
		userRepository.save(user);
		return 0;
	}

	@Override
	public int updateUser(Long id, User user) {
		int result = 0;
		Optional<User> originalUser = userRepository.findById(id);
		if(originalUser.isPresent()) {
			userRepository.save(user);
		}
		else result = -1;
		return result;
	}

	@Override
	public int deleteUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		if (!user.isPresent()) {return -1;}
		userRepository.delete(user.get());
		return 0;
	}

	
	

}
