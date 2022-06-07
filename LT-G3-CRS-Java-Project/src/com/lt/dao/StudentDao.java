package com.lt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.lt.bean.Catalog;
import com.lt.bean.Course;
import com.lt.bean.Student;
import com.lt.bean.User;

public class StudentDao implements StudentDaoInterface {
	
	static Map<String, String> catalog = new HashMap<>();
	static List studentCourseList = new ArrayList<>();
	static Student student = new Student();

	@Override
	public void viewStudentDetails() {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentDetails = new HashMap<Integer, String>();
		studentDetails.put(1001, "Mansi");
		studentDetails.put(1002, "Parul");
		studentDetails.put(1003, "Vaibhav");
		studentDetails.put(1004, "Akshay");
		studentDetails.put(1005, "Akhil");

		for (Map.Entry sDetails : studentDetails.entrySet()) {
			System.out.println(sDetails.getKey() + "-" + sDetails.getValue());
		}
	}

	@Override
	public void registerCourse(String studentName) {
		
		Student student = new Student(1, studentName, 0);
		System.out.println("Select Course to Register:");
		List course = new CourseDao().returnCoursesList();
		course.stream().peek(System.out::println);
		System.out.println("Select Course:");
		Scanner sc = new Scanner(System.in);
		String studentCourseChoice = sc.nextLine();
		
		if(course.stream().anyMatch(p -> p.equals(studentCourseChoice))) {
			student.setStudentCourse(new Course(studentCourseChoice, 1, 1));
			System.out.println( "Student [studentName=" + student.getStudentName() + ", studentGrades=" + student.getStudentGrades()
					+ ", CourseName="+ student.getStudentCourse().getCourseName()+"]");
			System.out.println("Successfully registered for the course!");
		} else {
			System.out.println("course not found!!");
		}
		
	}

	@Override
	public ArrayList<String> viewreportcard(int i) {
		// TODO Auto-generated method stub
		ArrayList<String> datalist = new ArrayList<String>();

		if (i == 10) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 1) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 2) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 3) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		} else if (i == 4) {

			datalist.add("Computer Science -> B+");
			datalist.add("Data Mining -> C-");
			datalist.add("Data Science -> D+");
			datalist.add("Data Architect -> C-");

		}
		Iterator<String> i6=datalist.iterator();
        while(i6.hasNext()){
      	  
      	  String test=i6.next();
      	  System.out.println(test);
        }
		return datalist;
	}
		
	

	@Override
	public Map<String, String> viewCatalog() {
		
		Map<String, String> courseMap = new HashMap<String, String>();
		courseMap.put("1", "Computer Science");
		courseMap.put("2", "Data Mining");
		courseMap.put("3", "Data Science");
		courseMap.put("4", "Data Architect");
		
		for(var entry: courseMap.entrySet()) {
			System.out.println(entry.getKey()+". "+ entry.getValue());
		}
		return courseMap;
	}

	@Override
	public void payFee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		System.out.println("Below are the offered courses: ");
		System.out.println(viewCatalog());
		Map studentCourseMap = viewCatalog();
		System.out.println("Add a course from catalog: ");
		Scanner sc = new Scanner(System.in);
		String studentCourseChoice = sc.nextLine();
		
		switch(studentCourseChoice) {
		case "1":
			studentCourseList.add(studentCourseMap.get(studentCourseChoice));
			System.out.println("Student Course list after adding : " + "\n"+ studentCourseList);
			
		}
		
		
	}

	@Override
	public void dropCourse() {
		// TODO Auto-generated method stub
		System.out.println("Below are the offered courses: ");
		System.out.println(viewCatalog());
		Map studentCourseMap = viewCatalog();
		System.out.println("Drop a course from Student Course List: ");
		Scanner sc = new Scanner(System.in);
		String studentCourseChoice = sc.nextLine();
		
		switch(studentCourseChoice) {
		case "1":
			viewCatalog().remove(studentCourseMap.get(studentCourseChoice));
			System.out.println("Student Course list after removing : " + "\n"+ viewCatalog());
			
		}
		
		
	}
}