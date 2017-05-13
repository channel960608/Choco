package com.healthy.dao;

import java.util.List;

import com.healthy.bean.User;

public interface UserDao {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User findUser(String id);
	
	public List<User> findAllUser();
	public List<User> findUserList();
	public List<User> findProList();
}
