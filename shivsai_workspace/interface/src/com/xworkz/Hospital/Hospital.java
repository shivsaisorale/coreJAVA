package com.xworkz.Hospital;


public class Hospital implements HospitalAdmitRule, HospitalDischargeRule {

	@Override
	public String register() {
		System.out.println("Pesent name");
		
		return "reddy";
	}
	@Override
	public double payAdvance() {
		System.out.println("Adavance amount");
		return 5000;
	}
	@Override
	public boolean validInsurance() {
		System.out.println("Pesent donot have Insurance");
		return false;
	}
	@Override
	public double discount() {
		System.out.println("Hospiat gives to discount amount to pesent");
		return 12500;
	}
	@Override
	public boolean payBill() {
	   System.out.println("Pesent payed total bill 8000");
		return true;
	}
	

}
