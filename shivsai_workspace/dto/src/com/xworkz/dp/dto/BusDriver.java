package com.xworkz.dp.dto;

public class BusDriver {

	private String state;
	private String name;
	private int location;
	private float startime;
	private String depo;
	private String busCompany;
	
	public BusDriver() {
		System.out.println("Invoked no-arg const");
	}

	public BusDriver(String state, String name, int location, float startime, String depo, String busCompany) {
		super();
		this.state = state;
		this.name = name;
		this.location = location;
		this.startime = startime;
		this.depo = depo;
		this.busCompany = busCompany;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location=location;
	}

	public float getStartime() {
		return startime;
	}

	public void setStartime(float startime) {
		this.startime = startime;
	}

	public String getDepo() {
		return depo;
	}

	public void setDepo(String depo) {
		this.depo = depo;
	}

	public String getBusCompany() {
		return busCompany;
	}

	public void setBusCompany(String busCompany) {
		this.busCompany = busCompany;
	}
	
	

}
