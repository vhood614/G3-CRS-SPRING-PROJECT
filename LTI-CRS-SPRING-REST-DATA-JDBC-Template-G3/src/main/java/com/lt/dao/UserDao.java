package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.configuration.JDBCConfiguration;
import com.lt.constant.JdbcTemplateSQLConstants;
import com.lt.mapper.CourseMapper;
import com.lt.mapper.UserMapper;

/**
 * 
 * UserDao class implementing the UserDaoInterface to get the unimplemented
 * methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */

@Repository
public class UserDao implements UserDaoInterface {
	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);
	Scanner sc = new Scanner(System.in);
	List<User> userDetails = new ArrayList<User>();

	@Autowired
	JDBCConfiguration jdbcConfiguration;

	/**
	 * 
	 * Here is a loginUsers method, which will be used to get the list of all login
	 * users.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public List<User> loginUsers() {
		// TODO Auto-generated method stub

		@SuppressWarnings("unchecked")
		List<User> user = jdbcConfiguration.jdbcTemplate().query(JdbcTemplateSQLConstants.SQL_UserList_Query,
				new UserMapper());

		logger.debug("in debug");
		return user;

	}

	/**
	 * 
	 * Here is a createRegistrationScreen method, which will be used to create the
	 * Registration screen from the welcome menu
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public void createRegistrationScreen(User user) {

		jdbcConfiguration.jdbcTemplate().update(JdbcTemplateSQLConstants.SQL_RegisterUser_Query, user.getId(),
				user.getName(), user.getPassword(), user.getUsername(), user.getRole());
		System.out.println("Created Record Id = " + user.getId() + " Name = " + user.getName() + " Password = "
				+ user.getPassword() + " Username = " + user.getUsername() + " Role = " + user.getRole());

		return;

	}

	@Override
	public void updatePassword(int id, User user) {
		// TODO Auto-generated method stub

		jdbcConfiguration.jdbcTemplate().update(JdbcTemplateSQLConstants.SQL_UpdateUserPassword_Query,
				user.getPassword(), user.getId());
		System.out.println("Updated Record with ID = " + user.getId());
		logger.info("Updated Record with ID = " + user.getId());
		return;

	}

	@Override
	public void updatePassword(User user) {
		// TODO Auto-generated method stub

	}

//	public void loginUser(User user) {
//		// TODO Auto-generated method stub
//		boolean flag = false;
//		userDetails.forEach(user1 -> {
//			if (user1.getUsername().equals(user1.getUsername()) && user.getPassword().equals(user1.getPassword())) {
//				flag = true;
//				LoggedInuser = user1;
//			}
//		});

//	}

}
