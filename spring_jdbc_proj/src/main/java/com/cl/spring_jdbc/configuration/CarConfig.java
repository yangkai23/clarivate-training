package com.cl.spring_jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com.cl.spring_jdbc"})
public class CarConfig {
	@Bean
	public DataSource getDataSource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/spring_jdbc", "root", "Optimus@2399");
	}
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
