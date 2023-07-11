package com.loquox.springapp.controllers;

import java.lang.System.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.loquox.springapp.services.ProductService;
import com.loquox.springapp.services.UserService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService products;
	
	@Autowired
	private UserService userService;
	
	 protected final Log logger = LogFactory.getLog(getClass());

	
	@RequestMapping("/product")
	public String productList(Model model) {
		
		model.addAttribute("productList", products.productList());
		
		
		return "product";
	}
	
	@RequestMapping("/usuario")
	public String userList(Model model) {
		model.addAttribute("listUsers",  userService.findAllUsers());
		return "users";
	}
	
}
