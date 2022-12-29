package org.spring.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BikeImpl implements IItems{
	public void usedFor() {
		System.out.println("used to ride");
	}

}
