package com.xworkz.dao;

public class TravelsImpl implements Transport {

	private String name;
	private String place;
	private Transport transport;
	

	public void setName(String name) {
		this.name = name;
		System.out.println("shooting of name"+name);
		
	}

	public void setPlace(String place) {
		this.place = place;
		System.out.println("shooting of place"+place);
		
	}
	
	public void setTransport(Transport transport) {
		this.transport = transport;
		System.out.println("shooting on transport"+transport);
	}

	

	@Override
	public void traffic() {
		System.out.println("shotting on traffic");
	}

}
