package com.sophia.usertest.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sophia.usertest.vo.User;
import com.sophia.util.CreateXL;

@Service
public interface UserService {
	public void delUser(User user);
	public void addUser(User user);
	public void updateUser(User user);
	public List<User> getUserList(User user,String page,String rows);
	public List<User> getUserList(String page,String rows);
	public List<User> getUserList();
	public List<User> searchUser(User user);
	public int getTotalAmoutOfUserList();
	public List<User> exportExcel();
	public List<User> checkUser(User user);
}
