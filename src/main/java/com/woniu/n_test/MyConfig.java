package com.woniu.n_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
 * xml
 * ×¢½â
 * javaconfig
 */
@Configuration
public class MyConfig {
	@Bean("dept")
	public Dept getDept(){
		Dept d = new Dept();
		d.setDeptno(1);
		d.setDname("andy");
		return d;
	}
}
