package org.spring.spring_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.spring.spring_config"})
public class MyConfig {
	@Bean(value = "candidate")
	public Candidate getCandidate() {
		return new Candidate();
	}
}
