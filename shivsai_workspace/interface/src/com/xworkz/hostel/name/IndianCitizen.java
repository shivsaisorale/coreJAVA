package com.xworkz.hostel.name;

import com.xworkz.hostel.name.city.constants.Adress;



public class IndianCitizen implements VotingRule,TrafficRule,MarriageRule {

	private String name;
	private Adress adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean validAge(char gender, int age) {
	System.out.println("Invoked valide from interface MarriageRule");
	if(age>=18) {
		return false;
	}
	return false;
	}
	
	@Override
	public String licence() {
		System.out.println("invoked licince num from interce TrafficRule");
		return "DL123445";
	}
	
	@Override
	public boolean validlicenseNo() {
		System.out.println("Invoked validlicenseNo from interface TrafficRule");
		return false;
	}
	@Override
	public boolean validInsurance() {
		System.out.println("Invoked validlicenseNo from interface TrafficRule");
		return false;
	}
	@Override
	public int votingAge() {
		System.out.println("Invoked validId from interface VotingRule");
		return 18;
	}
	@Override
	public String validId() {
		System.out.println("Invoked validId from interface VotingId");
		return "Kiran";
	}
	public void displayDetalis() {
		System.out.println(this.name);;
		System.out.println(adress.getAtPost());
		System.out.println(adress.getTal());
		System.out.println(adress.getDist());
		System.out.println(adress.getPostlCode());

	}
	
}
