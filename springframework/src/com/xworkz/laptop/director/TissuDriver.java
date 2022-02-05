package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;
import com.xworkz.laptop.Tissue;

public class TissuDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Tissue tissu = applicationContext.getBean("Tissue",Tissue.class);

		Boolean boo = tissu.cleanhand();
		System.out.println(boo.toString());

		String string2 = tissu.onetimeuse();
		System.out.println(string2.hashCode());

		Tissue tissu2 = applicationContext.getBean("Tissue2",Tissue.class);

		Boolean boo1 = tissu2.cleanhand();
		System.out.println(boo1.toString());

		String string3 = tissu2.onetimeuse();
		System.out.println(string3.hashCode());

	}
}
