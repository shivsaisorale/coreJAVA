package com.xworkx.framework.collection.stream;

public class PresidentDTO {

	private int id;
	private String name;
	private String countryName;
	private int tenure;

	public PresidentDTO() {
		System.out.println("invoked no-arg const");
	}

	public PresidentDTO(int id, String name, String countryName, int tenure) {
		super();
		this.id = id;
		this.name = name;
		this.countryName = countryName;
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "PresidentDTO [id=" + id + ", name=" + name + ", countryName=" + countryName + ", tenure=" + tenure
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

}
