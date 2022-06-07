/**
 * 
 */
package com.lt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lt.bean.Professor;

/**
 * @author 91988 
 * It is a ProfessorMapper class which will map the Professor
 *  table data.
 */
public class ProfessorMapper implements RowMapper<Professor> {

	@Override
	public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Professor professor = new Professor();
		professor.setProfId(rs.getInt("profId"));
		professor.setProfName(rs.getString("profName"));
		professor.setProfPassword(rs.getString("profPassword"));
		professor.setProfUserName(rs.getString("profUserName"));
		return professor;
	}

}
