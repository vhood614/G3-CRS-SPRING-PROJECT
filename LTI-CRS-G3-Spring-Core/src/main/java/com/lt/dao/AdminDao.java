package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lt.bean.Admin;
import com.lt.bean.Professor;
import com.lt.bean.User;

/**
 * 
 * AdminDao class implementing the AdminDaoInterface to get the unimplemented methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */
public class AdminDao implements AdminDaoInterface {
	CourseDao newCourseDao = new CourseDao();
	List adminCourseList = newCourseDao.returnCoursesList();
	ProfessorDao newProfessorDao = new ProfessorDao();
	Scanner sc = new Scanner(System.in);

	@Override
	public void adminLogin() {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * Here is a addCourse method, which will be used to add a new course in the catalog.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public void addCourse() {

		CourseDao newCourseDao = new CourseDao();
		System.out.println("-------------------------------------------");
		System.out.println("Here is the list of the existing courses: ");
		System.out.println("Courses: ");
		Iterator<String> i = adminCourseList.iterator();
		while (i.hasNext()) {

			String test = i.next();
			System.out.println(test);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Enter new course to add: ");
		String courseToAdd = sc.nextLine();
		adminCourseList.add(courseToAdd);
		System.out.println("--------------------------------------------");
		System.out.println("After Adding: ");
		Iterator<String> i9 = adminCourseList.iterator();
		while (i9.hasNext()) {

			String test = i9.next();
			System.out.println(test);
		}

		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * Here is a removeCourse method, which will be used to remove course from the catalog.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public void removeCourse() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		System.out.println("Here is the list of the existing courses: ");
		Iterator<String> i = adminCourseList.iterator();
		while (i.hasNext()) {

			String test = i.next();
			System.out.println(test);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Mention course to remove: ");
		String courseToRemove = sc.nextLine();

		adminCourseList.remove(courseToRemove);
		System.out.println("After removing:");
		System.out.println("-----------------------");
		Iterator<String> i1 = adminCourseList.iterator();
		while (i1.hasNext()) {

			String test = i1.next();
			System.out.println(test);
		}

	}
	
	/**
	 * 
	 * Here is a addProfessor method, which will be used to add a new professor.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */

	@Override
	public void addProfessor() {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
		System.out.println("List of existing professor: ");
		List listOfProfessor = newProfessorDao.getProfessorList();
		Iterator<Professor> i1 = listOfProfessor.iterator();
		while (i1.hasNext()) {

			Professor prof = i1.next();
			System.out.println(prof.getProfName());
		}
		System.out.println("-------------------------------------------");
		System.out.println("Add new professor: ");
		String newProfessor = sc.nextLine();
		System.out.println("Enter Username:  ");
		String userName = sc.nextLine();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		Professor p1 = new Professor(0, name, userName, password);
		listOfProfessor.add(p1);
		System.out.println("After adding professor: ");
		Iterator<Professor> i2 = listOfProfessor.iterator();
		while (i2.hasNext()) {

			Professor test = i2.next();
			System.out.println(test.getProfName());
		}

	}
	
	
	/**
	 * 
	 * Here is a approveStudentRegistration method, which will be used to approve student registrations.
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

}
