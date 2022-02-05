package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Oximeter;

public class OximeterDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Oximeter oxi = applicationContext.getBean("oximeter",Oximeter.class);

		boolean boo = oxi.skinthickness();
		System.out.println(boo);
		
		String string1=oxi.detectvirus();
		System.out.println(string1.toString());
		
		Oximeter oxi1 = applicationContext.getBean("oximeter2",Oximeter.class);

		boolean boo1 = oxi1.skinthickness();
		System.out.println(boo1);
		
		String string2=oxi1.detectvirus();
		System.out.println(string2.toString());

	}

}

