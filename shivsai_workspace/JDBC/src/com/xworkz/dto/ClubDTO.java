package com.xworkz.dto;

public class ClubDTO {

	private String name;
	private int id;
	private int entryfees;
	private String bouncer;
	private String location;
	private String isactive;
	
	
	
	public ClubDTO(String name, int id, int entryfees, String bouncer,String location,String isactive) {
		super();
		this.name = name;
		this.id = id;
		this.entryfees = entryfees;
		this.bouncer = bouncer;
		this.location=location;
		this.isactive=isactive;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public int getEntryfees() {
		return entryfees;
	}


	public String getBouncer() {
		return bouncer;
	}
	
	public String getLocation() {
		return location;
	}

	public String getIsactive() {
		return isactive;
	}
	
}
