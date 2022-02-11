package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Mask;

public class MaskDriver {

	public static void main(String[] args) {

		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Mask mask = applicationContext.getBean(Mask.class);

		boolean boo = mask.stitching();
		System.out.println(mask.toString());

		String string2 = mask.selling();
		System.out.println(mask.hashCode());

		Mask mask1 = applicationContext.getBean(Mask.class);

		

		String string3 = mask.selling();
		System.out.println(string3.hashCode());

	}

}
