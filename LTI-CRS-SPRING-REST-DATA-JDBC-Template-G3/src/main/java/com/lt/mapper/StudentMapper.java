/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.lt.bean.Course;
import com.lt.bean.Student;

/**
 * @author 91988
 *
 *
 *It is a StudentMapper class which will map the Student table
 *data.
 */
public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Student student = new Student();
		student.setStudentAddress(rs.getString("studentAddress"));
		student.setStudentAge(rs.getInt("studentAge"));
		student.setStudentCourse(rs.getString("studentCourse"));
		student.setStudentGender(rs.getString("studentGender"));
		student.setStudentGrades(rs.getInt("studentGrades"));
		student.setStudentId(rs.getInt("studentId"));
		student.setStudentName(rs.getString("studentName"));
		student.setStudentSemister(rs.getInt("studentSemister"));
		student.setStudentUserName(rs.getString("studentUserName"));
		student.setUserPassword(rs.getInt("userPassword"));
		
		return student;

	}
}