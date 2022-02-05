package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;
import com.xworkz.laptop.Steamer;

public class SteamerDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Steamer stm = applicationContext.getBean("Steamer", Steamer.class);

		boolean boo = stm.clean();
		System.out.println(boo.toString());

		String string2 = stm.heat();
		System.out.println(string2.hashCode());

		Steamer stm1 = applicationContext.getBean("Steamer1", Steamer.class);

		boolean boo1 = stm1.clean();
		System.out.println(boo1.toString());

		String string3 = stm1.heat();
		System.out.println(string3.hashCode());

	}

}
