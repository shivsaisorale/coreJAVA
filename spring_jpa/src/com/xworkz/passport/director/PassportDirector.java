package com.xworkz.passport.director;

import java.time.LocalDateTime;

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
		PassportEntity entity = new PassportEntity(1, "kiran", LocalDateTime.now(), LocalDateTime.now(), Gender.MALE,
				"234fgh5673", "bidar", "kiransorale", "policecase", PassportPersonnelType.REGULER, LocalDateTime.now(),
				BloodGroup.A_POSITIVIE, VerifiedDocument.LICENCE);

		PassportRepositery passportRepositery = new PassportRepositeryImpl();
		PassportService service = new PassportServiceImpl(passportRepositery);
		service.validateandsave(entity);
	}

}
