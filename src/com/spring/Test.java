package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext a= new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
		Employee e=(Employee) a.getBean("obj");
		e.display();
	}

}
