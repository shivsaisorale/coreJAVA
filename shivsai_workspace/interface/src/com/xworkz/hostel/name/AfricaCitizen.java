package com.xworkz.hostel.name;

import com.xworkz.hostel.name.city.constants.Adress;

public class AfricaCitizen implements VotingRule,MarriageRule,TrafficRule{

	private String name;
	private String StateName;
	private  Adress adress;
	public void displayDetails() {
	}
	
	
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStateName() {
		return StateName;
	}


	public void setStateName(String stateName) {
		StateName = stateName;
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
	public boolean validAge(char gender, int age) {
		// TODO Auto-generated method stub
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
		
		System.out.println(adress.getTal());
		System.out.println(adress.getDist());
	

	}
}
	

