package com.nutrivex.platform.app.service;


import com.nutrivex.platform.app.models.User;

public interface UserService {
	
	public abstract User findUser(String username);
	
	public abstract int createUser(User user);
	public abstract int updateUser(Long id, User user);
	public abstract int deleteUser(Long id);
	public abstract User findUser(Long id);


}
