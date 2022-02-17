package com.xworkz.ipl.director;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.ipl.entity.IplEntity;
import com.xworkz.ipl.repo.IplRepository;
import com.xworkz.ipl.repo.IplRepositoryImpl;
import com.xworkz.ipl.service.IplService;
import com.xworkz.ipl.service.IplServiceImpl;

public class IplDirector {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.getBean(IplService.class);
		IplEntity entity = new IplEntity(" RCBengaluru", "vijayamalya", "Viratkohli", "pepusi", LocalDateTime.now(), "100000");

		
		IplService iplService2 = applicationContext.getBean(IplService.class);
		iplService2.validatendsave(entity);

	}
}
