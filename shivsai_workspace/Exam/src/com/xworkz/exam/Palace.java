package com.xworkz.exam;

public class Palace {

	String name;
	String location;
	int entryFees;
	String opentime;
	String closetime;
	
	public Palace(String name, String location, int entryFees, String opentime, String closetime) {
		super();
		this.name = name;
		this.location = location;
		this.entryFees = entryFees;
		this.opentime = opentime;
		this.closetime = closetime;
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

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	@Override
	public String toString() {
		return "Palace [name=" + name + ", location=" + location + ", entryFees=" + entryFees + ", opentime=" + opentime
				+ ", closetime=" + closetime + "]";
	}
	
	
}
