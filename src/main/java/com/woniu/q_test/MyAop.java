package com.woniu.q_test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {

	@Pointcut("execution(* com.woniu.q_test..*.*(..))")
	public void pointCut() {

	}

//	@Before("pointCut()")
//	public void before() {
//		System.out.println("MyAop.before()");
//	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		StringBuffer strbf = new StringBuffer();
		strbf.append("------------------------------------\t\n");
		strbf.append("游客");
		strbf.append("访问了");
		strbf.append(new Date());
		strbf.append(pjp.getTarget() + "\t\n");
		strbf.append(pjp.getSignature() + "\t\n");
		strbf.append("------------------------------------");

		File file = new File("d:log.txt");

		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(strbf.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object object = null;
		try {
			object = pjp.proceed();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
		
		
	}

//	public void afterReturning() {
//		System.out.println("MyAop.afterReturning()");
//	}

//	public void throwExecption() {
//		System.out.println("MyAop.throwExecption()");
//	}

//	public void after() {
//		System.out.println("MyAop.after()");
//	}

}
