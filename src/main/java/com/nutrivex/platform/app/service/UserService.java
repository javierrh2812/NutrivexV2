package com.nutrivex.platform.app.service;

import com.nutrivex.platform.app.models.Users;

public interface UserService {
	public abstract Users findUser(String email);
	public abstract Users findUser(Long id);

}
