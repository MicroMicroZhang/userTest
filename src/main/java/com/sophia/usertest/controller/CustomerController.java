package com.sophia.usertest.controller;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sophia.usertest.service.CustomerService;
import com.sophia.usertest.service.UserService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	UserService userService;
	@Autowired
	HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customer(){
		
		return "customers";
	}
}
