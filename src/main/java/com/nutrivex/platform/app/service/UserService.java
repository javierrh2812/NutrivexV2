package com.nutrivex.platform.app.service;

import com.nutrivex.platform.app.models.Users;

public interface UserService {
	public Users findUser(String email);
	public Users findUser(Long id);

}
