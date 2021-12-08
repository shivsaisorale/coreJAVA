package com.xworkz.bus;

public class BusRouterDTO {

	private String id;
	private String starPoint;
	private String destination;
	private String driverName;
	
	public BusRouterDTO() {
	System.out.println("invoked bus");
	}
	
	
	public BusRouterDTO(String id, String starPoint, String destination, String driverName) {
		super();
		this.id = id;
		this.starPoint = starPoint;
		this.destination = destination;
		this.driverName = driverName;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStarPoint() {
		return starPoint;
	}


	public void setStarPoint(String starPoint) {
		this.starPoint = starPoint;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
}
