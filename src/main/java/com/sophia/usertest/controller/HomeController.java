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

import com.sophia.usertest.service.UserService;
import com.sophia.usertest.vo.User;
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

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public String getUser(Locale locale, Model model) {

		return "getUser";
	}

	
	
	@RequestMapping(value = "/getTotalAmoutOfUserList", method = RequestMethod.GET)
	public @ResponseBody int getTotalAmoutOfUserList() {

		return userService.getTotalAmoutOfUserList();
	}
	
	
	@RequestMapping(value = "/getUserList1", method = RequestMethod.GET)
	public @ResponseBody List<User> getUserList() {
		 
		List<User> user1 = new ArrayList<User>();
		user1 = userService.getUserList();
		return user1;
	}
	
	@RequestMapping(value = "/getUserList2", method = RequestMethod.GET)
	public @ResponseBody List<User> getUserList(String page, String rows) {
		 
		List<User> user1 = new ArrayList<User>();
		user1 = userService.getUserList(page,rows);
		return user1;
	}
	
	
	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	public @ResponseBody Map<String,Object> getUserList(User user, String page, String rows) {
		 
		List<User> user1 = new ArrayList<User>();
		user1 = userService.getUserList(user,page,rows);
		int total = userService.getTotalAmoutOfUserList();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("user", user1);
		map.put("total", total);
		return map;
	}

	// 删除一个用户
	@RequestMapping(value = "/delUser", method = RequestMethod.GET)
	public String delUser(Locale locale, Model model) {

		return "delUser";
	}

	@RequestMapping(value = "/delUser1", method = RequestMethod.POST)
	public @ResponseBody String delUser1(User user) {

		userService.delUser(user);
		return "success";

	}

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser(Locale locale, Model model) {

		return "addUser";
	}

	@RequestMapping(value = "/addUser1", method = RequestMethod.POST)
	public @ResponseBody String addUser(User user) {

		userService.addUser(user);

		return "success";
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	public String updateUser(Locale locale, Model model) {

		return "updateUser";
	}

	@RequestMapping(value = "/updateUser1", method = RequestMethod.POST)
	public @ResponseBody String updateUser(User user) {

		userService.updateUser(user);

		return "success";
	}

	@RequestMapping(value = "/searchUser", method = RequestMethod.GET)
	public String searchUser() {

		return "searchUser";
	}

	@RequestMapping(value = "/searchUser1", method = RequestMethod.GET)
	public @ResponseBody List<User> searchUser1(User user) {

		List<User> user1 = new ArrayList<User>();
		user1 = userService.searchUser(user);
		exportExcel();
		return user1;
	}
	
	
	@RequestMapping(value = "/exportExcel", method = RequestMethod.GET)
	public @ResponseBody List<User> exportExcel() {
		List<User> user1 = new ArrayList<User>();
		user1 = userService.getUserList();
			
		CreateXL xl = new CreateXL();
		xl.addCreateXL(user1);
		
		return user1;
	}
	

	
}
