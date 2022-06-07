/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.lt.bean.Course;

/**
 * @author 91988
 *
 *It is a CourseMapper class which will map the course table
 *data.
 */
public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setCourseName(rs.getString("courseName"));
		course.setCourseFees(rs.getInt("courseFees"));
		course.setCourseId(rs.getInt("courseId"));
		return course;

	}
}