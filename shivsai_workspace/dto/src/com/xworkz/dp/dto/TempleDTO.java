package com.xworkz.dp.dto;


public class TempleDTO {

	private String colour;
	private String name;
	private String location;
	private float yestGante;
	private boolean prasada;
	
	public TempleDTO() {
		System.out.println("no argument constructor invoked");
	}

	public TempleDTO(String colour, String name, String location, float yestGante, boolean prasada) {
		super();
		this.colour = colour;
		this.name = name;
		this.location = location;
		this.yestGante = yestGante;
		this.prasada = prasada;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getYestGante() {
		return yestGante;
	}

	public void setYestGante(float yestGante) {
		this.yestGante = yestGante;
	}

	public boolean isPrasada() {
		return prasada;
	}

	public void setPrasada(boolean prasada) {
		this.prasada = prasada;
	}

}
