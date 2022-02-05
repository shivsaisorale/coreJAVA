package com.xworkz.laptop.director;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.Paint;

public class PaintDriver {

	public static void main(String[] args) {
		String string = "resource/spring.xml";

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);
		

		Paint paint = applicationContext.getBean("Paint",Paint.class);
		
		Boolean boo=paint.apply();
		System.out.println(boo.toString());
	
		String string2=paint.brush();
		System.out.println(string2.hashCode());
		
		Paint paint1 = applicationContext.getBean("Paint1",Paint.class);
		Boolean boo1=paint1.apply();
		System.out.println(boo1.toString());
	
		String string3=paint.brush();
		System.out.println(string3.hashCode());
		
	}

}
