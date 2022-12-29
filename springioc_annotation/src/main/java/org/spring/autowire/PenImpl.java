package org.spring.autowire;

import org.springframework.stereotype.Component;
@Component
public class PenImpl implements IItems {

	public void usedFor() {
		System.out.println("used to write");
	}

}
