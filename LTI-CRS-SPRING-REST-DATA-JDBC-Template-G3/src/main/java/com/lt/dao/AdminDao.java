package com.lt.dao;

import java.awt.color.ICC_ProfileRGB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lt.bean.Admin;
import com.lt.bean.Course;
//import com.lt.bean.Employee;
import com.lt.bean.Professor;
import com.lt.bean.User;
import com.lt.configuration.JDBCConfiguration;
import com.lt.constant.JdbcTemplateSQLConstants;
import com.lt.mapper.CourseMapper;

/**
 * 
 * AdminDao class implementing the AdminDaoInterface to get the unimplemented
 * methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */

@Repository
public class AdminDao implements AdminDaoInterface {
	@Autowired
	JDBCConfiguration jdbcConfiguration;

	private static final Logger logger = LoggerFactory.getLogger(AdminDao.class);
	CourseDao newCourseDao = new CourseDao();
//	List adminCourseList = newCourseDao.returnCoursesList();
	ProfessorDao newProfessorDao = new ProfessorDao();
	Scanner sc = new Scanner(System.in);

	@Override
	public void adminLogin() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * Here we prepared an admin course list
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	private static List<Course> adminCourseList;
	{
		adminCourseList = new ArrayList();
		adminCourseList.add(new Course("Data Science", 101, 500));
		adminCourseList.add(new Course("Data Architect", 102, 506));
		adminCourseList.add(new Course("Data Mining", 103, 507));
		adminCourseList.add(new Course("Computer Science", 104, 508));

	}

	/**
	 * 
	 * Here is a showList method which will display the list of all the course.
	 * 
	 * @author Group3
	 * @return
	 * @return Nothing
	 *
	 */
	public List<Course> showList() {
		logger.debug("List of courses " + adminCourseList);
		logger.info("Listing admin courses");
		logger.error("This is logger error");

		@SuppressWarnings("unchecked")
		List<Course> course = jdbcConfiguration.jdbcTemplate().query(JdbcTemplateSQLConstants.SQL_Course_Query,
				new CourseMapper());

		logger.debug("in debug");
		return course;

	}

	/**
	 * 
	 * Here is a addCourse method, which will be used to add a new course in the
	 * catalog.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public void addCourse(Course course) {

		jdbcConfiguration.jdbcTemplate().update(JdbcTemplateSQLConstants.SQL_AddNewCourse_Query, course.getCourseName(),
				course.getCourseId(), course.getCourseFees());
		System.out.println("Created Record Name = " + course.getCourseName() + "Id = " + course.getCourseId()
				+ "Fees = " + course.getCourseFees());

		return;

		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * Here is a removeCourse method, which will be used to remove course from the
	 * catalog.
	 * 
	 * @author Group3
	 * @param id
	 * @return
	 * @return Nothing
	 *
	 */
	@Override
	public void removeCourse(Long id) {
		// TODO Auto-generated method stub

		jdbcConfiguration.jdbcTemplate().update(JdbcTemplateSQLConstants.SQL_RemoveCourse_Query, id);
		System.out.println("Deleted Record with ID = " + id);
		return;

	}

	/**
	 * 
	 * Here is a addProfessor method, which will be used to add a new professor.
	 * 
	 * @author Group3
	 * @return
	 * @return Nothing
	 *
	 */

	@Override
	public void addProfessor(Professor professor) {

		jdbcConfiguration.jdbcTemplate().update(JdbcTemplateSQLConstants.SQL_AddNewProfessor_Query,
				professor.getProfId(), professor.getProfName(), professor.getProfUserName(),
				professor.getProfPassword());
		System.out.println("Created Record Id = " + professor.getProfId() + "Name = " + professor.getProfName()
				+ "Username = " + professor.getProfUserName() + "Password = " + professor.getProfPassword());

		return;
	}

	/**
	 * 
	 * Here is a approveStudentRegistration method, which will be used to approve
	 * student registrations.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public void approveStudentRegistration() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		System.out.println("Enter the studentID to approve the course registration: ");
		int studentIdToApprove = sc.nextInt();
		if (studentIdToApprove == 1) {
			System.out.println("Student Registration Approved!!");
		} else {
			System.out.println("Not Approved");
		}

	}

	@Override
	public List addCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCourse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addProfessor() {
		// TODO Auto-generated method stub

	}

}
