package com.xworkz.dp.dto;

public class MetroStationDTO {
	private String name;
	private String route;
	private String pixel;
	private float openTime;
	private float closeTime;
	
	public MetroStationDTO() {
		System.out.println("no argument constructor invoked");
	}

	public MetroStationDTO(String name, String route, String pixel, float openTime, float closeTime) {
		super();
		this.name = name;
		this.route = route;
		this.pixel = pixel;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getPixel() {
		return pixel;
	}

	public void setPixel(String pixel) {
		this.pixel = pixel;
	}

	public float getOpenTime() {
		return openTime;
	}

	public void setOpenTime(float openTime) {
		this.openTime = openTime;
	}

	public float getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(float closeTime) {
		this.closeTime = closeTime;
	}

}
