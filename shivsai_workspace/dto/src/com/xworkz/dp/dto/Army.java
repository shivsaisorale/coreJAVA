package com.xworkz.dp.dto;

public class Army {

		private String colour;
		private String day;
		private int noOfhelicopters;
		private int size;
		private int noOftanks;
		
		
		public Army() {
		System.out.println("invoked Army no-arg const");
		}
public Army(String colour,String day,int noOfhelicopter,int size,int noOftanks)
{
super();
			this.colour=colour;
			this.day=day;
			this.noOfhelicopters=noOfhelicopters;
			this.size=size;
			this.noOftanks=noOftanks;
			
				
		}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public int getNoOfhelicopters() {
	return noOfhelicopters;
}
public void setNoOfhelicopters(int noOfhelicopters) {
	this.noOfhelicopters = noOfhelicopters;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getNoOftanks() {
	return noOftanks;
}
public void setNoOftanks(int noOftanks) {
	this.noOftanks = noOftanks;
}

	
}
