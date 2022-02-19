package com.xworkz.coffeday.director;

import java.time.LocalDate;

import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.coffeday.entity.CoffeDayEntity;
import com.xworkz.coffeday.service.CoffeDayService;

public class CoffeDayDirector {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		CoffeDayEntity coffeDayEntity = new CoffeDayEntity(1, "benagluru", "shivsai",LocalDate.of(2021, 11, 5),LocalTime.of(4, 6),LocalTime.of(9, 3));
		applicationContext.getBean(CoffeDayService.class).validateandsave(coffeDayEntity);
	}
}
