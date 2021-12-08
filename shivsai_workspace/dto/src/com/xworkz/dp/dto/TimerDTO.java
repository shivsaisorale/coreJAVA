package com.xworkz.dp.dto;

public class TimerDTO {

	
	private float correctTime;
	private String digital;
	private String bell;
	String brand;
	
	public TimerDTO() {
		System.out.println("no argument constructor");
	}

	public TimerDTO(float correctTime, String digital, String bell, String brand) {
		super();
		this.correctTime = correctTime;
		this.digital = digital;
		this.bell = bell;
		this.brand = brand;
	}

	public float getCorrectTime() {
		return correctTime;
	}

	public void setCorrectTime(float correctTime) {
		this.correctTime = correctTime;
	}

	public String getDigital() {
		return digital;
	}

	public void setDigital(String digital) {
		this.digital = digital;
	}

	public String getBell() {
		return bell;
	}

	public void setBell(String bell) {
		this.bell = bell;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
