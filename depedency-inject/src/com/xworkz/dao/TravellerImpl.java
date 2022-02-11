package com.xworkz.dao;

public class TravellerImpl implements Travels {

	private String name;
	private String owner;
	private Travels travels;

	public TravellerImpl() {
		System.out.println("shooting on traveller");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("shooting on name"+name);
	}

	public void setOwner(String owner) {
		this.owner = owner;
		System.out.println("shooting on owner"+owner);
	}

	public void setTravels(Travels travels) {
		this.travels = travels;
		System.out.println("shooting on travels"+travels);
	}

	
	@Override
	public void journy() {
		System.out.println("shooting on journy");
		
	}

}
