package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;

public class JuiceDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);
		

		Juice juice = applicationContext.getBean(Juice.class);
		
		String boo=juice.coldjuice();
		System.out.println(juice.toString());
	
		String string2=juice.coldjuice();
		System.out.println(string2.hashCode());
		
	}

}
