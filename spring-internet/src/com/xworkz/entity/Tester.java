package com.xworkz.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.browser.Browser;
import com.xworkz.browser.ChromeBrowser;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Browser browser = applicationContext.getBean(Browser.class);
		browser.surf();
	}
}
