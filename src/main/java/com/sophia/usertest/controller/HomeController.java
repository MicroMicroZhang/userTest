package com.sophia.usertest.controller;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sophia.usertest.service.UserService;
import com.sophia.util.CreateXL;

/**
 * Handles requests for the application home page.
 */
@Controller

public class HomeController {

	@Autowired
	UserService userService;
	@Autowired
	HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private CreateXL xl;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	

	
}
