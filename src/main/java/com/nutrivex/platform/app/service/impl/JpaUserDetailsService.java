package com.nutrivex.platform.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nutrivex.platform.app.models.Role;
import com.nutrivex.platform.app.models.Users;
import com.nutrivex.platform.app.repository.UsersRepository;

@Service
public class JpaUserDetailsService implements UserDetailsService {

	@Autowired
	private UsersRepository userRepository; 
	
	@Transactional(readOnly = true)
	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); 
		
		for (Role role : user.getRole()) {
			authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
		}	
		return new User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, authorities);
	}

}
