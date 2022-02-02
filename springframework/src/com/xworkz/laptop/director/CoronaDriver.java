package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Corona;

public class CoronaDriver {

	String string="resource/spring.xml";
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
	
	Corona corona=applicationContext.getBean(Corona.class);
	corona.happy();

}
