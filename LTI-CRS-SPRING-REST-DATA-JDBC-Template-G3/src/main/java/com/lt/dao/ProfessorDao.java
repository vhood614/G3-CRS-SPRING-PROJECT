package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Course;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.configuration.JDBCConfiguration;
import com.lt.constant.JdbcTemplateSQLConstants;
import com.lt.mapper.CourseMapper;
import com.lt.mapper.ProfessorMapper;
import com.lt.mapper.StudentMapper;
import com.lt.mapper.UserMapper;
import com.lt.service.CourseService;
import com.lt.service.StudentService;

/**
 * 
 * ProfessorDao class implementing the ProfessorDaoInterface to get the
 * unimplemented methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */
@Repository
public class ProfessorDao implements ProfessorDaoInterface {
	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);

	@Autowired
	JDBCConfiguration jdbcConfiguration;

	/**
	 * 
	 * Here is a getProfessorList method, which will be used to return the list of
	 * professors.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */

	public List<Professor> getProfessorList() {

		@SuppressWarnings("unchecked")
		List<Professor> professor = jdbcConfiguration.jdbcTemplate()
				.query(JdbcTemplateSQLConstants.SQL_ProfessorList_Query, new ProfessorMapper());

		logger.debug("in debug");
		return professor;
	}

	/**
	 * 
	 * Here is a getTeachingCourses method, which will be used to display the list
	 * of courses the professor is teaching.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public List getTeachingCourses() {
		@SuppressWarnings("unchecked")
		List<Course> course = jdbcConfiguration.jdbcTemplate().query(JdbcTemplateSQLConstants.SQL_Course_Query,
				new CourseMapper());

		logger.debug("in debug");
		return course;

	}

	/**
	 * 
	 * Here is a getEnrollesStudentDetails method, which will be used to display the
	 * list of students enrolled for the courses.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public List getEnrollesStudentDetails() {

		@SuppressWarnings("unchecked")
		List<Student> student = jdbcConfiguration.jdbcTemplate().query(JdbcTemplateSQLConstants.SQL_StudentList_Query,
				new StudentMapper());

		logger.debug("in debug");
		return student;
	}

	@Override
	public void viewReportCard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewCourse() {
		// TODO Auto-generated method stub

	}

}
