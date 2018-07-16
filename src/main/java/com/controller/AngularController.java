package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;

@RestController
public class AngularController {
	
	@RequestMapping("/api")
	public String connect() {
		return "Connected";
	}
	
	@PostMapping("/api/user") 
		public int getUser(@RequestBody User user) {
			System.out.println("Receiving data.......");
			user.print();
			return 0;
		}

}
