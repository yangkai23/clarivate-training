package org.spring.spring_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCandidate {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Candidate candidate=context.getBean("candidate",Candidate.class);
		candidate.isEligible();
	}
}
