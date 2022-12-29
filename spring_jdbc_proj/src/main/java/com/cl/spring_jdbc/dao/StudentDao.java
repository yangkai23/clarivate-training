package com.cl.spring_jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cl.spring_jdbc.dto.Student;
import com.cl.spring_jdbc.util.StudentMapper;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private StudentMapper studentMapper;

	public Student saveStudent(Student student) {
		String sql = "insert into spring_jdbc.student values(?,?,?,?,?)";
		Object ar[] = { student.getId(), student.getName(), student.getSchool(), student.getPhone(),
				student.getFees() };
		jdbcTemplate.update(sql, ar);
		return student;
	}

	public void deleteStudent(int id) {
		String sql = "delete from spring_jdbc.student where id=?";
		Object ar[] = { id };
		jdbcTemplate.update(sql, ar);
	}

	public Student updateStudent(Student student) {
		String sql = "update spring_jdbc.student set name=?,phone=?,fees=? where id=?";

		Object ar[] = { student.getName(), student.getPhone(), student.getFees(), student.getId() };
		jdbcTemplate.update(sql, ar);
		return student;
	}

	public Student getStudentById(int id) {
		String sql = "select * from spring_jdbc.student where id=?";
		Object ar[] = { id };
		return jdbcTemplate.queryForObject(sql, ar, studentMapper);
	}

	public List<Map<String, Object>> getAllStudents() {
		String sql = "select * from spring_jdbc.student";
		return jdbcTemplate.queryForList(sql);
	}
}
