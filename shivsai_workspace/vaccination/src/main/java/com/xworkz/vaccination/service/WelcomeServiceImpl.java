package com.xworkz.vaccination.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.vaccination.dao.WelcomeDAO;
import com.xworkz.vaccination.entity.WelcomeEntity;

@Component
public class WelcomeServiceImpl implements WelcomeService {

	@Autowired
	private WelcomeDAO dao;

	public WelcomeServiceImpl(WelcomeDAO dao) {
		this.dao = dao;
		System.out.println(this.getClass().getSimpleName() + "bean created");
		System.out.println("invoked service method");

	}

	@Override
	public boolean validateEmail(String email) {
		System.out.println("invoked validateLaptopDTO()");
		boolean valid = false;

		if (!email.isEmpty() && email != null && (email.contains("@")) && (email.endsWith(".com"))) {
			valid = true;
			System.out.println("valid mail");

		} else {
			System.out.println("invalid mail");
			valid = false;
			return valid;
		}

		if (valid = true) {
			dao.saveWelcomeEntity(null);
		}
		return valid;

	}

	public char[] getFourDigitOTP(int LenOTP) {

		{
			System.out.println("Generating OTP using random() : ");
			System.out.print("You OTP is : ");

			String numbers = "0123456789";

			Random random = new Random();

			char[] otp = new char[LenOTP];

			for (int i = 0; i < LenOTP; i++) {
				otp[i] = numbers.charAt(random.nextInt(numbers.length()));
			}
			return otp;
		}

	}

	@Override
	public boolean saveEmailAndOTP(String email, int otp) {
		System.out.println("invoked savemail");
		WelcomeEntity welcomeEntity = new WelcomeEntity();
		welcomeEntity.setEmail(email);
		welcomeEntity.setOtp(otp);
		boolean isEntitySaved = dao.saveWelcomeEntity(welcomeEntity);
		return isEntitySaved;
	}

}
