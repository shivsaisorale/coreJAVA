package com.xworkz.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.adress.Adress;

public class CustomerDirector {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.getBean(Customer.class).order("juice");
		
	}

}
