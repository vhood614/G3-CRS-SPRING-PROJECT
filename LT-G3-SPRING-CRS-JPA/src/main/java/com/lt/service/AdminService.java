package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.entity.Course;
import com.lt.entity.Professor;
import com.lt.entity.User;
import com.lt.repository.AdminRepository;
import com.lt.repository.CourseRepository;
import com.lt.repository.ProfessorRepository;

@Service
public class AdminService implements AdminServiceInterface {
//
//	@Autowired
//	private AdminRepository adminRepository;
	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private ProfessorRepository professorRepository;

	public List<Course> getAllCourses() {
		List<Course> courseList = new ArrayList<>();
		courseRepository.findAll().forEach(courseList::add);
		return courseList;

	}

	public void addCourse(Course courses) {
		courseRepository.save(courses);

	}

	public void removeCourse(int courseId) {
		courseRepository.deleteById(courseId);
	}

	public void addProfessor(Professor professor) {
		professorRepository.save(professor);

	}

}
