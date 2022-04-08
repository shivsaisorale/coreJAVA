package com.xworkz.vaccination.service;


public interface WelcomeService {

	
	default boolean validateEmail(String email) {
		return true;
		
	}

	default char[] getFourDigitOTP(int OTP) {
		return getFourDigitOTP(OTP);
	}
	

	public boolean saveEmailAndOTP(String email, int otp);

}
