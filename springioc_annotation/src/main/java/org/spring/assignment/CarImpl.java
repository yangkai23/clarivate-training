package org.spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CarImpl implements IVehicle{
	@Value(value = "4566")
private int car_num;
	@Value(value = "Fortuner")
private String car_name;
@Autowired
@Qualifier(value = "twinImpl")
private IEngine car_engine;
	public void run() {
		System.out.println("Car has four wheels");
		TwinImpl twinImpl=(TwinImpl)car_engine;
		System.out.println("Car Engine Number : "+twinImpl.getEngine_num());
		System.out.println("Car Name : "+getCar_name());
		System.out.println("Car Number : "+getCar_num());
		System.out.println("Car Engine Name : "+twinImpl.getEngine_name());
	}
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
	public IEngine getCar_engine() {
		return car_engine;
	}
	public void setCar_engine(IEngine car_engine) {
		this.car_engine = car_engine;
	}

}
