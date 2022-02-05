package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Juice;
import com.xworkz.laptop.Sanitizer;

public class SanitizerDriver {

	public static void main(String[] args) {

		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);

		Sanitizer sani = applicationContext.getBean("Sanitizer", Sanitizer.class);

		Boolean boo = sani.killjurms();
		System.out.println(boo.toString());

		String string2 = sani.effectofeyes();
		System.out.println(string2.hashCode());

		Sanitizer sani1 = applicationContext.getBean("Sanitizer1", Sanitizer.class);

		Boolean boo1 = sani1.killjurms();
		System.out.println(boo1.toString());

		String string3 = sani1.effectofeyes();
		System.out.println(string3.hashCode());
	}
}