package com.afby.library.es.service;

import java.util.List;

import com.afby.library.entities.User;

public interface UserService {
	
	User register(User user);
	
	List<User> getAllUsers();
	
	User getUser(Double id);
	
	User updateUser(User user);
	
}
