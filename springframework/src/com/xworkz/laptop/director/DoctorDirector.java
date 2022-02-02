package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Doctor;

public class DoctorDirector {

	public static void main(String[] args) {
		
		String string="resource/spring.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(string);

		Doctor doctor= context.getBean(Doctor.class);
		doctor.treat();
		
	}

}
