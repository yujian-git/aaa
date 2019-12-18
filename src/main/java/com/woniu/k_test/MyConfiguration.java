package com.woniu.k_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public Dept getDept() {
		Dept dept = new Dept();
		dept.setCar(getCar());
		return dept;
	}
	
	@Bean
	public Car getCar() {
		Car car = new Car();
		car.setName("±£Ê±½Ý");
		return car;
	}
}
