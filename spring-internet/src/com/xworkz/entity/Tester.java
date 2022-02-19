package com.xworkz.entity;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MIN;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.browser.ChromeBrowser;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	ChromeBrowser browser=applicationContext.getBean(ChromeBrowser.class);
	browser.surf();
	}
}
