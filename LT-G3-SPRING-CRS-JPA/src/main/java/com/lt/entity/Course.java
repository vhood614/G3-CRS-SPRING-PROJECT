package com.lt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="course_Id")
	private int courseId;
	@Column(name="course_Name")
	private String courseName;
	@Column(name="course_Fees")
	private int courseFees;
	
	public Course() {
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int l) {
		this.courseId = l;
	}

	public int getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}

	public Course(String courseName, int i, int courseFees) {
		super();
		this.courseName = courseName;
		this.courseId = i;
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseFees=" + courseFees + "]";
	}

}
