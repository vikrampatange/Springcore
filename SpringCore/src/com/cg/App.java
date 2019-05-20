package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
		
		/*Car car=new Car();
		car.drive();
        */
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		
		
		
	}

}
