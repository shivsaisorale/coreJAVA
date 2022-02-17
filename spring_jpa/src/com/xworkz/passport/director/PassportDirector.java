package com.xworkz.passport.director;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.passport.constant.BloodGroup;
import com.xworkz.passport.constant.Gender;
import com.xworkz.passport.constant.PassportPersonnelType;
import com.xworkz.passport.constant.VerifiedDocument;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repositery.PassportRepositery;
import com.xworkz.passport.repositery.PassportRepositeryImpl;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImpl;

public class PassportDirector {
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.getBean(PassportService.class);
		
		PassportEntity entity = new PassportEntity
	(1, "kiran", LocalDateTime.of(2022,4,5,13,43,37), LocalDateTime.of(2035,5,6,12,12), Gender.MALE,
	"31195855", "MAiloorcrossbasavanagarbidar585401home", "kiransorale", "policecase", PassportPersonnelType.REGULER, LocalDateTime.now(),
	BloodGroup.A_POSITIVIE, VerifiedDocument.LICENCE);

		PassportRepositery passportRepositery = new PassportRepositeryImpl();
		PassportService service = new PassportServiceImpl(passportRepositery);
		service.validateandsave(entity);
	}

}
