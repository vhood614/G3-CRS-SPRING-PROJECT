package com.lt.controller;

import java.util.Scanner;

import com.lt.service.StudentService;
import com.lt.service.StudentServiceInterface;

public class StudentApplication implements StudentApplicationInterface {
	Scanner sc = new Scanner(System.in);
	static StudentService studentService;

	public StudentApplication() {
		studentService = new StudentService();
	}

	/**
	 * @param args
	 */

	public void createStudentView(String studentName) {
		StudentService studService = new StudentService();
		// TODO Auto-generated method stub
		System.out.println("Choose from following options:");
		System.out.println("--------------");
		System.out.println("1. View Caatalog");
		System.out.println("2. Course Registration");
		System.out.println("3. Add Course");
		System.out.println("4. Drop Course");
		System.out.println("5. View Grades");
		System.out.println("6. Pay Fee");

		System.out.println("Enter Student Id :");
		int studentId = sc.nextInt();
		System.out.println("Enter your choice: ");
//		Scanner sc = new Scanner(System.in);
		int studOperationChoice = sc.nextInt();

		switch (studOperationChoice) {
		case 1:
			studentService.viewCatalog();
			break;

		case 2:
			studentService.registerCourse(studentName);

			break;

		case 3:
			studentService.addCourse();
			break;

		case 4:
			studentService.dropCourse();
			break;

		case 5:
			studentService.viewReportcard(studentId);
			break;
		case 6:
			break;

		}

	}

}
