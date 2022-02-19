package com.xworkz.coffeeday.dirctor;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.service.CoffeeDayService;

public class CoffeeDirector {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		CoffeeDayEntity coffeDayEntity = new CoffeeDayEntity(1, "benagluru", "shivsai", LocalDate.of(2021, 11, 5),
				LocalTime.of(4, 6), LocalTime.of(9, 3));
		applicationContext.getBean(CoffeeDayService.class).validateandsave(coffeDayEntity);
	}

}
