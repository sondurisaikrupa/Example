package com.examspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("com/examspring/applicationContext.xml");
		Question q=(Question) a.getBean("q");
		q.displayInfo();
	}
}
