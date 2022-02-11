package com.xworkz.laptop.camera;

import org.apache.maven.repository.metadata.ClasspathContainer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.dao.Person;
import com.xworkz.dao.TravelsImpl;




public class TransportDirector {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml") ;
		applicationContext.getBean(TravelsImpl.class);
		applicationContext.getBean(Person.class);
		

		
	}
	
	
	
	
 	
}
