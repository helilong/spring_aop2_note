package com.xiaohe.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	
	@Test
	public void t() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Book book = (Book) context.getBean("book");
		book.add();
	}
	
	public static void main(String[] args) {
	
	}
}
