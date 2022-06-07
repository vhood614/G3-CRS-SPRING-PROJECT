package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lt.bean.Student;
import com.lt.bean.User;

/**
 * 
 * UserDao class implementing the UserDaoInterface to get the unimplemented methods.
 * 
 * @author Group3
 * @return Nothing
 *
 */
public class UserDao implements UserDaoInterface {
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 
	 * Here is a loginUsers method, which will be used to get the list
	 * of all login users.
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	@Override
	public List<User> loginUsers() {
		// TODO Auto-generated method stub
		
		List<User> userDetails= new ArrayList<User>();
		User u1= new User("10001", "Praveen", "praveen11", "@praveen", "Professor");
		User u2= new User("10002", "Naveen", "naveen11", "@naveen", "Professor");
		User u3= new User("10003", "Mridul", "mridul1", "@mridul", "Student");
		User u4= new User("10004", "Raj", "raj11", "@raj", "Professor");
		User u5= new User("10005", "admin", "admin11", "@admin", "Admin");
		
		
		userDetails.add(u1);
		userDetails.add(u2);
		userDetails.add(u3);
		userDetails.add(u4);
		userDetails.add(u5);
		
		return userDetails;
		
	}
	
	/**
	 * 
	 * Here is a createRegistrationScreen method, which will be used to create the Registration screen from the welcome menu
	 * 
	 * @author Group3
	 * @return Nothing
	 *
	 */
	public void createRegistrationScreen() {

		System.out.println("Enter required details for registration: ");
		System.out.println("Enter id: ");
		String id = sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		
		System.out.println("Enter Username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter Role: ");
		String role = sc.nextLine();
		
		System.out.println("New user created.."+"\n");
		User u6 = new User(id, name, password, username, role);
		
		List afterAddingNewUserList = loginUsers();
		afterAddingNewUserList.add(u6);
		Iterator<User> i=afterAddingNewUserList.iterator();
        while(i.hasNext()){
      	  
      	  User test=i.next();
      	  System.out.println(test);
        }
		System.out.println(afterAddingNewUserList);
		
	}

}
