package com.lt.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.lt.bean.User;
import com.lt.dao.UserDao;
import com.lt.service.CourseService;
import com.lt.service.ProfessorService;
import com.lt.service.StudentService;

public class ProfessorApplication implements ProfessorApplicationInterface{
	
	/**
	 * Menu for the professor.
	 */
	
	/**
	 * @param args
	 */
	
	public void professorlogin() {
		ProfessorService profService = new ProfessorService();
		
			System.out.println("Choose from following options:");
			System.out.println("--------------");
			System.out.println("1. View Teaching Courses -->");
			System.out.println("2. View Enrolled Student -->");
			System.out.println("3. Add Grades -->");

			System.out.println("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			int profOperationChoice2 = sc.nextInt();
			switch (profOperationChoice2) {
			case 1:
				CourseService courseService = new CourseService();
				courseService.listCourses();
				break;

			case 2:
				StudentService studentService = new StudentService();
				studentService.viewStudentDetails();
				break;

			case 3:

			}
		}

		
	
}
