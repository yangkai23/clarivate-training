package com.cl.spring_jdbc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cl.spring_jdbc.dto.Car;
@Component
public class CarMapper implements RowMapper<Car> {
	@Autowired
	Car car;
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		car.setCar_num(rs.getInt(1));
		car.setCar_name(rs.getString(2));
		car.setCar_company(rs.getString(3));
		System.out.println("Mapper is called");
		System.out.println(rowNum);
		return car;
	}

}
