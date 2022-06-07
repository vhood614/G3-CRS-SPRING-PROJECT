/**
 * 
 */
package com.lt.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.dao.StudentDao;
import com.lt.service.StudentService;
import com.lt.service.UserService;

/**
 * @author 91988
 *
 *         This is an StudentController class which will run all the methods
 *         from the StudentDao class.
 */
@RestController
@CrossOrigin
public class StudentController {

	@Autowired
	public StudentDao studentDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/students")
	@ResponseBody
	public List getStudentDetails() {
		System.out.println("-------studentDAOMEHOTD-------" + studentDao);
		System.out.println("-------here in controller-------");
		return studentDao.viewStudentDetails();

	}

//	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/students")
//	@ResponseBody
//	public void registerForCourse() {
//		String studentName;
//		return;
//	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/students/reportcard")
	@ResponseBody
	public List getReportCard() {
		return studentDao.viewreportcard(10);

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/students/coursecatalog")
	@ResponseBody
	public List viewCourseCatalog() {
		return studentDao.viewCatalog();

	}

}
