package org.spring.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.spring.assignment"})
public class MyConfig {
	@Bean(value = "bike")
public BikeImpl getBike() {
	return new BikeImpl();
}
	@Bean(value = "car")
public CarImpl getCar() {
	return new CarImpl();
}
}
