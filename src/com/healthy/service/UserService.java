package com.healthy.service;

import java.util.List;

import com.healthy.bean.User;

public interface UserService {
	
	void saveUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User findUser(String id);
	List<User> getUsers(int i);
	
}
