package org.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainVehicle {
public static void main(String[] args) {
	ApplicationContext context =new AnnotationConfigApplicationContext(MyConfig.class);
	IVehicle vehicle=context.getBean("bike",BikeImpl.class);
	vehicle.run();
}
}
