/**
 * 
 */
package com.lt.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lt.dao.ProfessorDao;

/**
 * @author 91988
 *
 *         This is an ProfessorController class which will run all the methods
 *         from the ProfessorDao class.
 */

@RestController
@CrossOrigin
public class ProfessorController {

	@Autowired
	public ProfessorDao professorDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/professors")
	@ResponseBody
	public List readProfessorList() {
		return professorDao.getProfessorList();

	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/professors/teachingcourses")
	@ResponseBody
	public List readTeachingCoursesList() {
		return professorDao.getTeachingCourses();
	}

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/professors/enrolledStudents")
	@ResponseBody
	public List readEnrolledStudentsList() {
		return professorDao.getEnrollesStudentDetails();

	}

}
