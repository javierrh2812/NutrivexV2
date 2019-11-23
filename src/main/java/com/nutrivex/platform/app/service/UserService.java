package com.nutrivex.platform.app.service;

import com.nutrivex.platform.app.models.User;

public interface UserService {
	public abstract int createUser(User user);
	public abstract User findUser(String username);
	public abstract User findUser(Long id);
	public void userDataPatient(Long id);
	public void userDataNutritionist(Long id);
	public Long getLastValue();

}
