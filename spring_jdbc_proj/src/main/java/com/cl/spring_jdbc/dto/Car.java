package com.cl.spring_jdbc.dto;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private int car_num;
	private String car_name;
	private String car_company;
	public int getCar_num() {
		return car_num;
	}
	public void setCar_num(int car_num) {
		this.car_num = car_num;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_company() {
		return car_company;
	}
	public void setCar_company(String car_company) {
		this.car_company = car_company;
	}
//	@Override
//	public String toString() {
//		return "Car [car_num=" + car_num + ", car_name=" + car_name + ", car_company=" + car_company + "]";
//	}
	
}
