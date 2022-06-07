package com.lt.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.lt.bean.User;
import com.lt.dao.UserDao;
import com.lt.service.CourseService;
import com.lt.service.StudentService;
import com.lt.service.UserService;

public class CRSApplication implements CRSApplicationInterface{
	static LocalDateTime localDateTime = LocalDateTime.now();
	static List<User> userData = new ArrayList<>();
	static AdminApplication admin = new AdminApplication();
	static ProfessorApplication professor = new ProfessorApplication();
	static StudentApplication student = new StudentApplication();
	static boolean flag;
	static User LoggedInuser = null;

	static private UserService userService = new UserService();

	/**
	 * @param args
	 */

	/**
	 * Main method for users to login and new registration
	 */

	public  void  crsLaunchMenu(){

		userData = userService.loginUsers();

		Scanner sc = new Scanner(System.in);

		System.out.println("==Welcome to CRS Application==");
		System.out.println("1. Login");
		System.out.println("2. New Registeration");
		System.out.println("3. Update Password");
		System.out.println("Please select your choice: ");

		int input = sc.nextInt();
		sc.nextLine();

		switch (input) {
		case 1:
			System.out.println("Enter UserName: ");
			String userName = sc.nextLine();
			System.out.println("Enter Password: ");
			String pwd = sc.nextLine();
			flag = false;

			userData.forEach(user -> {
				if (user.getUsername().equals(userName) && user.getPassword().equals(pwd)) {
					flag = true;
					LoggedInuser = user;
				}
			});
			if (flag) {
				System.out.println("Welcome User - " + LoggedInuser.getRole() + "-" + "" + LoggedInuser.getName()
						+ "   " + localDateTime);
				String role = LoggedInuser.getRole();
				if (role.equals("Admin")) {
					admin.createAdminView();
				}
				if (role.equals("Student")) {
					student.createStudentView(LoggedInuser.getName());
				}
				if (role.equals("Professor")) {
					professor.professorlogin();
				}
			} else {
				System.out.println("Username or Password Incorrect!!");
				return;
			}
			break;

		case 2:

			userService.createNewRegistrationScreen();

		}

	}
}
