package com.cl.spring_jdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cl.spring_jdbc.dto.Car;
import com.cl.spring_jdbc.util.CarMapper;
@Repository
public class CarDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	CarMapper carMapper;
	public void saveCar(Car car ) {
		String sql="insert into spring_jdbc.car values(?,?,?)";
		Object ar[]= {car.getCar_num(),car.getCar_name(),car.getCar_company()};
		jdbcTemplate.update(sql, ar);
		System.out.println("Data inserted");
	}
	
	public Car getCar(int id) {
		String sql="select * from spring_jdbc.car where car_num=?";
		Object ar[]= {id};
		return jdbcTemplate.queryForObject(sql, ar, carMapper);
	}
	public List<Map<String, Object>> getAllCars(){
		String sql="select * from spring_jdbc.car";
		return jdbcTemplate.queryForList(sql);
	}
}
