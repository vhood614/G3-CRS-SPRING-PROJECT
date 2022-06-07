package com.lt.bean;

public class Course {
	private String courseName;
	private int courseId;
	private int courseFees;
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}
	
	
	public Course(String courseName, int courseId, int courseFees) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseFees = courseFees;
	}
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseFees=" + courseFees + "]";
	}
	
	
	
	

}
