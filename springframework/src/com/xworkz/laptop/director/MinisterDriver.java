package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Minister;

public class MinisterDriver {

	public static void main(String[] args) {
		
	
	String  string="resource/spring.xml";
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
	
	Minister minister=applicationContext.getBean(Minister.class);
	minister.corruption();
	
	Minister minister1=applicationContext.getBean("String",Minister.class);
	
	}
}
