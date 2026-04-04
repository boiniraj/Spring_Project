package com.nt.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.user.dto.UserDetails;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping("/get")
	public String userDetails(UserDetails user)
	{
		
		user.setUserName("Raj");
		user.setPhno("9505511961");
		user.setAddr("dmpt");
		
		
		String a=user.toString();
				
		return a;
	}

}
