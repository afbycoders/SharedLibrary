package com.afby.library.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afby.library.entities.User;
import com.afby.library.es.service.UserService;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RestController
@RequestMapping("/userService")
public class UserWebService {

	@Autowired
	private UserService usrService;

	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return usrService.getAllUsers();
	}

	@RequestMapping("/registerUser")
	public User registerUser(@RequestParam String name, @RequestParam String emailId, @RequestParam String phnNo,
			@RequestParam String pwd) {

		User user = new User();
		user.setUserName(name);
		user.setEmailId(emailId);
		user.setPhoneNo(phnNo);
		user.setPassword(pwd);
		
		return usrService.register(user);
	}

	@RequestMapping("/updateUser")
	public User updateUser(@RequestParam Double id){
		User usr=usrService.getUser(id);
		usr.setEmailId("abccc");
		return usrService.updateUser(usr);
	}

	@RequestMapping("/getUser")
	public User getUser(@RequestParam Double id){
		return usrService.getUser(id);
	}
	
}
