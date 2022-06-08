/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.User;
import com.lt.dao.AdminDao;
import com.lt.dao.UserDao;

/**
 * @author 91988
 *
 *         This is an UserController class which will run all the methods from
 *         the UserDao class.
 */

@RestController
@CrossOrigin
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);

	@Autowired
	public UserDao userDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/user/userslist")
	@ResponseBody
	public List showUsersList() {
//		logger.debug("Showing the list of users " + userDao.loginUsers());
		logger.info("Showing the list of users");
		logger.error("This is logger error");
		return userDao.loginUsers();
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/user/registeruser")
	@ResponseBody
	public ResponseEntity registerUser(@RequestBody User user) {

		logger.debug("Registering new user " + userDao.loginUsers());
		logger.info("Registering new user");

		userDao.createRegistrationScreen(user);
		return new ResponseEntity(user, HttpStatus.OK);
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.PUT, value = "/user/updateuser/{id}")
	@ResponseBody
	public ResponseEntity updateUSer(@PathVariable int id, @RequestBody User user) {
		userDao.updatePassword(id, user);
		return new ResponseEntity("User Password updated for userId: " + id, HttpStatus.OK);

	}

//	public ResponseEntity loginUser(@RequestBody User user) {
//		UserDao.loginUser(user);

//	}

}
