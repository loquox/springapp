package com.loquox.springapp.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	 protected final Log logger = LogFactory.getLog(getClass());
	 
	 @RequestMapping
	 public String mostraInicio() {
		 logger.info("porfavor sal bien ");
		 
		 return "home";
	 }
	 

}
