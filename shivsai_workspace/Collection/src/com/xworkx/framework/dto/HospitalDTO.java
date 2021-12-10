package com.xworkx.framework.dto;

import java.io.Serializable;

public class HospitalDTO implements Serializable {

	private String name, type, location;
	private int noOfPatients, noOfStaffs;

	public HospitalDTO() {
		System.out.println("invoked no-arg const");
	}

	public HospitalDTO(String name, String type, String location, int noOfPatients, int noOfStaffs) {
		super();
		this.name = name;
		this.type = type;
		this.location = location;
		this.noOfPatients = noOfPatients;
		this.noOfStaffs = noOfStaffs;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode of objects");
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals methods of objects");
		if (obj != null) {
			if (obj instanceof HospitalDTO) {
				HospitalDTO casted = (HospitalDTO) obj;
				if (this.name.equals(casted.name) && this.location.equals(casted.location)) {
					System.out.println("HospitalDTO is same :".concat(location));
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", type=" + type + ", location=" + location + ", noOfPatients="
				+ noOfPatients + ", noOfStaffs=" + noOfStaffs + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
}
