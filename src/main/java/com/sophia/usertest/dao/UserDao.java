package com.sophia.usertest.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sophia.usertest.vo.User;
import com.sophia.util.CreateXL;

public interface UserDao {


	public void delUser(@Param("user")User user);
	public void addUser(@Param("user")User user);
	public void updateUser(@Param("user")User user);
	public List<User> getUserList(@Param("user")User user, @Param("page") Integer page,@Param("rows") Integer rows);
	public List<User> searchUser(User user);
	public int getTotalAmoutOfUserList();
	public List<User> getUserList();
	public List<User> getUserList(@Param("page") Integer page,@Param("rows") Integer rows);
	public List<User> exportExcel();
	public List<User> checkUser(User user);
}
