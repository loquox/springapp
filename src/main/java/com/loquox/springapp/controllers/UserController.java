package com.loquox.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loquox.springapp.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/Users")
	public String userList(Model model) {
		model.addAttribute("listUsers", userService.findAllUsers());
		return "users";
	}
	
	

}
