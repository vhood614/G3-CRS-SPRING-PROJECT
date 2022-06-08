package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lt.bean.Catalog;
import com.lt.bean.Course;

public interface StudentDaoInterface {
	
	public List viewStudentDetails();
	public void registerCourse(String studentName);	
    public ArrayList<String> viewreportcard(int id);  
    public List<Course> viewCatalog();
    public void addCourse();
    public void dropCourse();
	void payFee();
    
}
