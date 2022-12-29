package org.spring.assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class TwinImpl implements IEngine{
	@Value(value = "131")
	private int engine_num;
	@Value(value = "Twin")
	private String engine_name;
	public int getEngine_num() {
		return engine_num;
	}
	public void setEngine_num(int engine_num) {
		this.engine_num = engine_num;
	}
	public String getEngine_name() {
		return engine_name;
	}
	public void setEngine_name(String engine_name) {
		this.engine_name = engine_name;
	}
	
}
