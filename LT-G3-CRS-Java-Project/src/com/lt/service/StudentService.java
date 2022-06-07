package com.lt.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.lt.bean.Catalog;
import com.lt.bean.Student;
import com.lt.dao.StudentDao;

public class StudentService implements StudentServiceInterface {

	static private StudentDao studentDao = new StudentDao();

	public void viewStudentDetails() {
		studentDao.viewStudentDetails();
	}

	@Override
	public void registerCourse(String studentName) {
		studentDao.registerCourse(studentName);
	}

	public void viewReportcard(int id) {
		int i = id;
		studentDao.viewreportcard(i);

	}

	public void viewCatalog() {
		ArrayList<Catalog> resultlist = (ArrayList<Catalog>) studentDao.viewCatalog();

		System.out.println(" Courses:");
		resultlist.stream().peek(System.out::println);

	}

	@Override
	public void payFee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		studentDao.addCourse();

	}

	@Override
	public void dropCourse() {
		// TODO Auto-generated method stub
		studentDao.dropCourse();

	}

}
