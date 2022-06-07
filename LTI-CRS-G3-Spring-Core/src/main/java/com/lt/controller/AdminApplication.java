/**
 * 
 */
package com.lt.controller;

import java.util.Scanner;

import com.lt.service.AdminService;
import com.lt.service.CourseService;
import com.lt.service.CustomerService;
import com.lt.service.StudentService;

/**
 * @author 91988
 *
 */
public class AdminApplication implements AdminApplicationInterface{
	/**
	 * @param args
	 */
	public void createAdminView(){

		System.out.println("Choose from following options:");
		System.out.println("--------------");
		System.out.println("1. Add Course");
		System.out.println("2. Remove Course");
		System.out.println("3. Add Professor");
		System.out.println("4. Approve Student Registration");
		System.out.println("5. Generate Report Card");

		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int adminOperationChoice = sc.nextInt();

		switch (adminOperationChoice) {
		case 1:
			AdminService adminService = new AdminService();
			adminService.addCourse();
			break;

		case 2:
			AdminService adminService1 = new AdminService();
			adminService1.removeCourse();
			break;

		case 3:
			AdminService adminService2 = new AdminService();
			adminService2.addProfessor();
			break;

		case 4:
			AdminService adminService3 = new AdminService();
			adminService3.approveStudentRegistration();
			break;

		//
		}
	}

}
