package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Professor;


public class ProfessorDao implements ProfessorDaoInterface{
	List<Professor> professorList =getProfessorList();

	@Override
	public void viewReportCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewCourse() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Professor> getProfessorList(){
		List<Professor> professors = new ArrayList<>();
		professors.add(new Professor(1, "Hood", "vhood", "123"));
		professors.add(new Professor(2, "UTK", "utk", "123"));
		professors.add(new Professor(3, "Atharva", "AD", "123"));
		
		return professors;
	}

}
