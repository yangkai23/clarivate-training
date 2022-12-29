package com.cl.spring_jdbc.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cl.spring_jdbc.configuration.CarConfig;
import com.cl.spring_jdbc.dao.CarDao;
import com.cl.spring_jdbc.dto.Car;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
//			Car car=context.getBean("car",Car.class);
//			car.setCar_num(5623);
//			car.setCar_name("GT POLO");
//			car.setCar_company("Volkswagon");
		CarDao dao = context.getBean("carDao", CarDao.class);
//			dao.saveCar(car);
		List<Map<String, Object>> cars = dao.getAllCars();
		for(Map<String, Object> car:cars) {
			System.out.println(car.get("car_num"));
			System.out.println(car.get("car_name"));
			System.out.println(car.get("car_company"));
			System.out.println("=======================");
		}
	}

}
