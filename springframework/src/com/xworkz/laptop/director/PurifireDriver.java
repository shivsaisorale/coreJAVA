package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;
import com.xworkz.laptop.Purifier;

public class PurifireDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Purifier puri = applicationContext.getBean("Purifier", Purifier.class);

		Boolean boo = puri.cleanwater();
		System.out.println(puri.toString());

		String string2 = puri.drinkwater();
		System.out.println(string2.hashCode());

		Purifier puri1 = applicationContext.getBean("Purifier1", Purifier.class);

		Boolean boo1 = puri1.cleanwater();
		System.out.println(boo1.toString());

		String string3 = puri1.drinkwater();
		System.out.println(string3.hashCode());

	}
}
