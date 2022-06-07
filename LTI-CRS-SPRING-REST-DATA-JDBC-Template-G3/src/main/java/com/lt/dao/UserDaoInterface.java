package com.lt.dao;

import java.util.List;

import com.lt.bean.User;

public interface UserDaoInterface {
	public List loginUsers();
	
	public void updatePassword(User user);

	void updatePassword(int id, User user);

}
