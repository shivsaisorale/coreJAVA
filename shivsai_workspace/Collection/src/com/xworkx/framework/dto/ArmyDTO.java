package com.xworkx.framework.dto;

import java.io.Serializable;

public class ArmyDTO implements Serializable {

	private String country, type, uniformColor;
	private int noOfSoldiers;

	public ArmyDTO() {
		System.out.println("invoked no-arg const");
	}

	public ArmyDTO(String country, String type, String uniformColor, int noOfSoldiers) {
		super();
		this.country = country;
		this.type = type;
		this.uniformColor = uniformColor;
		this.noOfSoldiers = noOfSoldiers;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashcode of objects");
		return 9;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals methods of objects");
		if (obj != null) {
			if (obj instanceof ArmyDTO) {
				ArmyDTO casted = (ArmyDTO) obj;
				if (this.country.equals(casted.country) && this.type.equals(casted.type)) {
					System.out.println("ArmyDTO is same :".concat(country));
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ArmyDTO [country=" + country + ", type=" + type + ", uniformColor=" + uniformColor + ", noOfSoldiers="
				+ noOfSoldiers + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUniformColor() {
		return uniformColor;
	}

	public void setUniformColor(String uniformColor) {
		this.uniformColor = uniformColor;
	}

	public int getNoOfSoldiers() {
		return noOfSoldiers;
	}

	public void setNoOfSoldiers(int noOfSoldiers) {
		this.noOfSoldiers = noOfSoldiers;
	}
}