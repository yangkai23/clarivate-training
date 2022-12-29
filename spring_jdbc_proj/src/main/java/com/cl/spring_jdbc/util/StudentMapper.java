package com.cl.spring_jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cl.spring_jdbc.dto.Student;

@Component
public class StudentMapper implements RowMapper<Student> {
	@Autowired
	private Student student;

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setSchool(rs.getString(3));
		student.setPhone(rs.getLong(4));
		student.setFees(rs.getDouble(5));
		return student;
	}
}
