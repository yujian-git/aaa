package com.woniu.o_test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyRound{
	@Pointcut("execution(* com.woniu.o_test.UserServiceImpl.save(int))")
	public void pointCut() {
		
	}
	
	@Around("pointCut()")
	public Object arround(ProceedingJoinPoint pjp) {
		Object proceed = null;
		System.out.println("before");
		try {
			proceed = pjp.proceed();
			System.out.println("afterReturning");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("throwException");
			e.printStackTrace();
		}finally {
			System.out.println("after");
		}
		return 345;
	}
	
}
