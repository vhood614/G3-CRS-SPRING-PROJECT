package com.lt.service;

import com.lt.dao.CourseDao;

public class CourseService implements CourseServiceInterface{
	CourseDao courseDao = new CourseDao();
	public void listCourses()  {
		CourseDao courseDao = new CourseDao();
		System.out.println(courseDao.returnCoursesList());
		
	}
	
	public void addCourses() {
	}

}
