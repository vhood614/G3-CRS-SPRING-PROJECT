package com.lt.application;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lt.bean.User;
import com.lt.configuration.AppConfig;
import com.lt.service.AdminServiceInterface;
import com.lt.service.CourseService;
import com.lt.service.ProfessorServiceInterface;
import com.lt.service.StudentServiceInterface;
import com.lt.service.UserServiceInterface;

/**
 * This file is the entry point for the application and representing by the
 * annotation @SpringBootApplication which tells the spring container that it is
 * a entry point for the project
 * 
 * springapplication.run() will execute and the spring boot application will get
 * up.
 *
 */

@SpringBootApplication
@Configuration
@ComponentScan({ "com.lt.*" })
@EnableAutoConfiguration
@Import({ AppConfig.class })
public class LtiCrsG3SpringCoreApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SpringApplication.run(LtiCrsG3SpringCoreApplication.class, args);

		List userData = new ArrayList<>();
		boolean flag;
		User LoggedInuser = null;
		LocalDateTime localDateTime = LocalDateTime.now();
		Scanner sc = new Scanner(System.in);

		ApplicationContext context = SpringApplication.run(AppConfig.class);

		StudentServiceInterface studObj = (StudentServiceInterface) context.getBean("studentBean");
		AdminServiceInterface adminObj = (AdminServiceInterface) context.getBean("adminBean");
		ProfessorServiceInterface profObj = (ProfessorServiceInterface) context.getBean("professorBean");
		UserServiceInterface userObj = (UserServiceInterface) context.getBean("userBean");

		userData = userObj.loginUsers();

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
			for (Object user : userData) {
				if (((User) user).getUsername().equals(userName) && ((User) user).getPassword().equals(pwd)) {
					flag = true;
					LoggedInuser = (User) user;
				}
			}
//			userData.forEach(user -> {
//				if (((User) user).getUsername().equals(userName) && ((User) user).getPassword().equals(pwd)) {
//				flag = true;
//					LoggedInuser = (User) user;
//				}
//			});
			if (flag) {
				System.out.println("Welcome User - " + LoggedInuser.getRole() + "-" + "" + LoggedInuser.getName()
						+ "   " + localDateTime);
				String role = LoggedInuser.getRole();
				if (role.equals("Admin")) {
					System.out.println("Choose from following options:");
					System.out.println("--------------");
					System.out.println("1. Add Course");
					System.out.println("2. Remove Course");
					System.out.println("3. Add Professor");
					System.out.println("4. Approve Student Registration");
					System.out.println("5. Generate Report Card");

					System.out.println("Enter your choice: ");
					int adminOperationChoice = sc.nextInt();

					switch (adminOperationChoice) {
					case 1:
						adminObj.addCourse();
						break;

					case 2:
						adminObj.removeCourse();
						break;

					case 3:
						adminObj.addProfessor();
						break;

					case 4:
						adminObj.approveStudentRegistration();
						break;

					}
				}
				if (role.equals("Student")) {
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
					int studOperationChoice = sc.nextInt();

					switch (studOperationChoice) {
					case 1:
						studObj.viewCatalog();
						break;

					case 2:
						String studentName = LoggedInuser.getName();
						studObj.registerCourse(studentName);

						break;

					case 3:
						studObj.addCourse();
						break;

					case 4:
						studObj.dropCourse();
						break;

					case 5:
						studObj.viewReportcard(studentId);
						break;
					case 6:
						break;

					}

				}
				if (role.equals("Professor")) {
					System.out.println("Choose from following options:");
					System.out.println("--------------");
					System.out.println("1. View Teaching Courses -->");
					System.out.println("2. View Enrolled Student -->");
					System.out.println("3. Add Grades -->");

					System.out.println("Enter your choice: ");
					int profOperationChoice2 = sc.nextInt();
					switch (profOperationChoice2) {
					case 1:
						CourseService courseService = new CourseService();
						courseService.listCourses();
						break;

					case 2:
						studObj.viewStudentDetails();
						break;

					case 3:

					}
				}
			} else {
				System.out.println("Username or Password Incorrect!!");
				return;
			}
			break;

		case 2:

			userObj.createNewRegistrationScreen();

		}

	}

}
