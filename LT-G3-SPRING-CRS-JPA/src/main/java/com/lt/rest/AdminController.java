/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.entity.Course;
import com.lt.entity.Professor;
import com.lt.entity.User;
import com.lt.service.AdminService;

/**
 * @author 91988
 *
 *         This is an AdminController class which will run all the admin methods
 *         from the AdminDao class.
 */

@RestController 
@CrossOrigin 
public class AdminController {
//	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);
//
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/listcourse")
	public List<Course> getAllCourses() {
		return adminService.getAllCourses();
	}
	
	@RequestMapping(value = "/add-course", method = RequestMethod.POST)
	public void addNewCourse(@RequestBody Course courses) {
		adminService.addCourse(courses);
	}
	
	@RequestMapping(value = "/delete-course/{courseId}", method = RequestMethod.DELETE)
	public void removeCourse(@PathVariable int courseId) {
		adminService.removeCourse(courseId);
	}
	
	@RequestMapping(value = "/add-professor", method = RequestMethod.POST)
	public void addProfessor(@RequestBody Professor professor) {
		adminService.addProfessor(professor);
	}
	
	
}