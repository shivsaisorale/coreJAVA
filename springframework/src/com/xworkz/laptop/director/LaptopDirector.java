package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Laptop;

public class LaptopDirector {

	public static void main(String[] args) {

		String xmlpath = "resource/spring.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlpath);

		Laptop laptop = applicationContext.getBean(Laptop.class);
		laptop.start();

	}

}
