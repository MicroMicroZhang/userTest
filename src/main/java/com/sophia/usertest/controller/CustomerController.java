package com.sophia.usertest.controller;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sophia.usertest.service.CustomerService;
import com.sophia.usertest.service.UserService;
import com.sophia.usertest.vo.Customer;
import com.sophia.usertest.vo.User;
import com.sophia.util.CreateXL;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customer(){
		
		return "customers";
	}
	
	@RequestMapping(value = "/getCustomer",method= RequestMethod.GET)
	public @ResponseBody List<Customer> getCustomer(){
		List<Customer> customer = new ArrayList<Customer>();
		customer = customerService.getCustomer();
		return customer;
		
	}
	@RequestMapping(value = "/addCustomer",method=RequestMethod.POST)
	public @ResponseBody void addCustomer(Customer customer){
		customerService.addCustomer(customer);
		return;
	}
}
