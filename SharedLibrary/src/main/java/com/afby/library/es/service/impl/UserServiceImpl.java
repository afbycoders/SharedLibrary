package com.afby.library.es.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afby.library.common.constants.LibraryConstants;
import com.afby.library.common.es.service.ElasticSearchCommonUtilities;
import com.afby.library.entities.User;
import com.afby.library.es.service.UserService;
import com.afby.library.repository.UserRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ElasticSearchCommonUtilities esUtils;
	
	@Override
	public User register(User user) {
		user.setId(esUtils.generateID(LibraryConstants.USER_TYPE));
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		Iterable<User> usersIterable=userRepo.findAll();
		List<User> userList=new ArrayList<>();
		usersIterable.forEach(e->userList.add(e));
		return userList;
	}

	@Override
	public User getUser(Double id) {
		return userRepo.findOne(id);
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

}
