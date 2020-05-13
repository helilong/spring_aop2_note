package com.xiaohe.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {
	
	@Before(value ="execution(* com.xiaohe.aop.Book.*(..))")
	public void before1() {
		System.out.println("«∞÷√_________");
	}
	
	public void after1() {
		System.out.println("∫Û÷√________");
	}
}
