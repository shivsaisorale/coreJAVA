package com.xworkz.dp.dto;

public class IPLDTO {

	private String name;
	private String sponsor;
	private String owner;
	private int teamSize;
	int noOfteams;
	
	public IPLDTO(){
		System.out.println("Invoked IPLDTO no-arg const");
		
	}

	public IPLDTO(String name, String sponsor, String owner, int teamSize, int noOfteams) {
		super();
		this.name = name;
		this.sponsor = sponsor;
		this.owner = owner;
		this.teamSize = teamSize;
		this.noOfteams = noOfteams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getNoOfteams() {
		return noOfteams;
	}

	public void setNoOfteams(int noOfteams) {
		this.noOfteams = noOfteams;
	}
	
}
