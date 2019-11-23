package com.nutrivex.platform.app.service;

import com.nutrivex.platform.app.models.User;

public interface UserService {
<<<<<<< HEAD
	public abstract int createUser(User user);
=======
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708
	public abstract User findUser(String username);
	public abstract User findUser(Long id);
	public void userDataPatient(Long id);
	public void userDataNutritionist(Long id);
	public Long getLastValue();

}
