package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Minister;

public class MinisterDriver {

	String  string="resource/spring.xml";
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
	
	Minister minister=applicationContext.getBean(Minister.class);
	Minister.corruption();
	
}
