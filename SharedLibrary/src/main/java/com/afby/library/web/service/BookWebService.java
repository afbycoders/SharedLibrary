package com.afby.library.web.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookWebService {

	@RequestMapping("/test")
	public String test(){
		return "Bhasker";
	}
}
