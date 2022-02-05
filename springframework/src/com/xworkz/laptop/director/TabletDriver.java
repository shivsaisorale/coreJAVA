package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;
import com.xworkz.laptop.Tablet;

public class TabletDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Tablet tablet = applicationContext.getBean("Tablet",Tablet.class);

		Boolean boo = tablet.eat();
		System.out.println(boo.toString());

		String string2 = tablet.recover();
		System.out.println(string2.hashCode());

		Tablet tablet1 = applicationContext.getBean("Tablet",Tablet.class);

		Boolean boo1 = tablet1.eat();
		System.out.println(boo1.toString());

		String string3 = tablet1.recover();
		System.out.println(string3.hashCode());

	}
}
