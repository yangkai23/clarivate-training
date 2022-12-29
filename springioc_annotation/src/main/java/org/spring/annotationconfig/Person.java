package org.spring.annotationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "person")
public class Person {
	@Value(value = "131")//field Injection
	int id;
	@Value(value = "Anirudh")
	String name;
	public void walk() {
		System.out.println("walking");
	}
	public void talk() {
		System.out.println("talking");
	}
}
