package com.sophia.usertest.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophia.usertest.dao.UserDao;
import com.sophia.usertest.service.UserService;
import com.sophia.usertest.vo.User;
import com.sophia.util.CreateXL;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void delUser(User user) {
		// TODO Auto-generated method stub

		userDao.delUser(user);

	}

	@Override
	public List<User> searchUser(User user) {
		// TODO Auto-generated method stub
		List<User> user1 = new ArrayList<User>();
		user1 = userDao.searchUser(user);
		return user1;
	}

	@Override
	public List<User> getUserList(User user, String page, String rows) {
		// TODO Auto-generated method stub
		List<User> user1 = new ArrayList<User>();
		// int pageSql = Integer.parseInt(page)*Integer.parseInt(rows);
		// int rowsSql = Integer.parseInt(rows);
		System.out.println(page);
		System.out.println(rows);
		user1 = userDao.getUserList(user, (Integer.parseInt(page) - 1) * Integer.parseInt(rows),
				Integer.parseInt(rows));
		return user1;
	}

	public List<User> getUserList() {
		List<User> user1 = new ArrayList<User>();
		user1 = userDao.getUserList();

		
		return user1;
	}

	public List<User> getUserList(String page, String rows) {
		List<User> user1 = new ArrayList<User>();
		user1 = userDao.getUserList((Integer.parseInt(page) - 1) * Integer.parseInt(rows), Integer.parseInt(rows));
		int a = (Integer.parseInt(page) - 1) * Integer.parseInt(rows);
		int b = Integer.parseInt(rows);
		System.out.println(a);
		System.out.println(b);
		return user1;
	}

	@Override
	public int getTotalAmoutOfUserList() {
		// TODO Auto-generated method stub
		return userDao.getTotalAmoutOfUserList();
	}

	@Override
	public List<User> exportExcel() {
		// TODO Auto-generated method stub
		userDao.exportExcel();
		return userDao.exportExcel();
	}



}
