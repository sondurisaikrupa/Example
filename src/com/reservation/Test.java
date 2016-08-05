package com.reservation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext a=new ClassPathXmlApplicationContext("com/reservation/applicationContext.xml");
		
		ReservationEventsCollection r=(ReservationEventsCollection) a.getBean("collection");
		r.display();
		
		
		
	}

}
