package com.woniu.m_test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {
	@Pointcut("execution(* com.woniu.m_test.UserServiceImpl.save(int i))")
	public void pointCut() {
		
	}
	
	
	@Before("pointCut()")
	public void before() {
		System.out.println("MyAOP.before()");
	}
	
	@After("pointCut()")
	public void after() {
		System.out.println("MyAOP.after()");
	}
	
	@AfterThrowing("pointCut()")
	public void throwException() {
		System.out.println("MyAOP.throwException()");
	}
	
	@AfterReturning("pointCut()")
	public void afterReturn() {
		System.out.println("MyAOP.afterReturn()");
	}
	
}
