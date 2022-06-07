package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lt.bean.Admin;
import com.lt.bean.Professor;
import com.lt.bean.User;

public class AdminDao implements AdminDaoInterface{
	CourseDao newCourseDao = new CourseDao();
	 List adminCourseList = newCourseDao.returnCoursesList();
	  ProfessorDao newProfessorDao = new ProfessorDao();
	Scanner sc = new Scanner(System.in);
	@Override
	public void adminLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourse() {
		
		
		CourseDao newCourseDao = new CourseDao();
//		List adminCourseList = newCourseDao.returnCoursesList();
		System.out.println("Here is the list of the existing courses: ");
		Iterator<String> i=adminCourseList.iterator();
        while(i.hasNext()){
      	  
      	  String test=i.next();
      	  System.out.println(test);
        }
		System.out.println("Enter new course to add: ");
		String courseToAdd = sc.nextLine();
		adminCourseList.add(courseToAdd);
		Iterator<String> i9=adminCourseList.iterator();
        while(i9.hasNext()){
      	  
      	  String test=i9.next();
      	  System.out.println(test);
        }
//		System.out.println(newCourseDao.returnCoursesList());
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCourse() {
		// TODO Auto-generated method stub
		System.out.println("Here is the list of the existing courses: ");
		Iterator<String> i=adminCourseList.iterator();
        while(i.hasNext()){
      	  
      	  String test=i.next();
      	  System.out.println(test);
        }
        
        System.out.println("Mention course to remove: ");
        String courseToRemove = sc.nextLine();
//        if()
        	
        adminCourseList.remove(courseToRemove);
        System.out.println("After removing:");
        System.out.println("-----------------------");
        Iterator<String> i1=adminCourseList.iterator();
        while(i1.hasNext()){
      	  
      	  String test=i1.next();
      	  System.out.println(test);
        }
		
	}

	@Override
	public void addProfessor() {
		// TODO Auto-generated method stub
		System.out.println("List of existing professor: ");
		List listOfProfessor = newProfessorDao.getProfessorList();
		Iterator<Professor> i1=listOfProfessor.iterator();
        while(i1.hasNext()){
      	  
      	   Professor prof = i1.next();
      	  System.out.println(prof.getProfName());
        }
        
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
        Iterator<Professor> i2=listOfProfessor.iterator();
        while(i2.hasNext()){
      	  
      	  Professor test = i2.next();
      	  System.out.println(test.getProfName());
        }
        
        
		
	}	

	@Override
	public void approveStudentRegistration() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the studentID to approve the course registration: ");
		int studentIdToApprove = sc.nextInt();
		if(studentIdToApprove == 1) {
			System.out.println("Student Registration Approved!!");
		}else {
			System.out.println("Not Approved");
		}
		
	}

}
