/**
 * 
 */
package com.lt.constant;

/**
 * @author 91988
 *
 *This class proveides all the JDBC queries required to fetch the data
 *from the database.
 */
public class JdbcTemplateSQLConstants {

	public static final String SQL_Course_Query = "select * from course";
	public static final String SQL_StudentList_Query = "select * from student";
	public static final String SQL_UserList_Query = "select * from user";
	public static final String SQL_RegisterUser_Query = "insert into user (id, name,password,username,role) values (?, ?, ?, ?, ?)";
	public static final String SQL_UpdateUserPassword_Query = "update user set password = ? where id = ?";
	public static final String SQL_RemoveCourse_Query = "delete from course where courseId = ?";
	public static final String SQL_AddNewProfessor_Query = "insert into professor (profId, profName, profUsername, profPassword) values (?, ?, ?, ?)";
	public static final String SQL_AddNewCourse_Query = "insert into course (courseName, courseId, courseFees) values (?, ?, ?)";
	public static final String SQL_ProfessorList_Query = "select * from professor";
}
