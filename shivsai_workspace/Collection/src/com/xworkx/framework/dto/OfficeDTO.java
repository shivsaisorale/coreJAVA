package com.xworkx.framework.dto;

import java.io.Serializable;

public class OfficeDTO implements Serializable {

	private String officeName, location;
	private int noOfEmployees;
	private boolean saniterized;

	public OfficeDTO() {
		System.out.println("invoked no-arg const");
	}

	public OfficeDTO(String officeName, String location, int noOfEmployees, boolean saniterized) {
		super();
		this.officeName = officeName;
		this.location = location;
		this.noOfEmployees = noOfEmployees;
		this.saniterized = saniterized;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode of objects");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals methods of objects");
		if (obj != null) {
			if (obj instanceof OfficeDTO) {
				OfficeDTO casted = (OfficeDTO) obj;
				if (this.officeName.equals(casted.officeName) && this.location.equals(casted.location)) {
					System.out.println("OfficeDTO is same :".concat(officeName));
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "OfficeDTO [officeName=" + officeName + ", location=" + location + ", noOfEmployees=" + noOfEmployees
				+ ", saniterized=" + saniterized + "]";
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public boolean isSaniterized() {
		return saniterized;
	}

	public void setSaniterized(boolean saniterized) {
		this.saniterized = saniterized;
	}

}
