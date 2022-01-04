package com.example.demo.config;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetialService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		if(username.equals("Siddharth")) {
			return new User("Siddharth", "Sidd@123", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("User not found!!");
		}
	}

}
