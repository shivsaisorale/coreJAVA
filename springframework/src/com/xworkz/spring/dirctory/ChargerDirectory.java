package com.xworkz.spring.dirctory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.Charger;
import com.xworkz.spring.ElectricCookTop;
import com.xworkz.spring.SolarWaterHeater;
import com.xworkz.spring.ToothPaste;
import com.xworkz.spring.Ups;

public class ChargerDirectory {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource/init.xml");

		Charger charger = applicationContext.getBean("charger", Charger.class);

		SolarWaterHeater heater = applicationContext.getBean("solarwaterheater", SolarWaterHeater.class);
		System.out.println(heater.getCapacity());
		System.out.println(heater.getBrand());
		System.out.println(heater.getPrice());
		System.out.println(heater.isColdwater());

		Ups ups1 = applicationContext.getBean("ups", Ups.class);

		ElectricCookTop cookTop = applicationContext.getBean("electric", ElectricCookTop.class);
		System.out.println(cookTop.getBrand());
		System.out.println(cookTop.getWeight());
		System.out.println(cookTop.getColor());
		System.out.println(cookTop.getLiters());
		System.out.println(cookTop.getWireLenght());
		System.out.println(cookTop.getCustomer());
		System.out.println(cookTop.getWarranty());

	}
}
