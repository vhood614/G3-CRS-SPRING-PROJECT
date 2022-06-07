/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lt.bean.Student;
import com.lt.bean.User;

/**
 * @author 91988
 *
 *It is a UserMapper class which will map the User table data.
 */

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		User user = new User();
		user.setId(rs.getInt("Id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		user.setRole(rs.getString("role"));
		user.setUsername(rs.getString("username"));

		return user;

	}
}
