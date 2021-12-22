package com.xworkx.framework.collection.stream;

public class PresidentDTO {

	private String id;
	private String name;
	private String countryName;
	private String tenure;

	public PresidentDTO() {
		System.out.println("invoked no-arg const");
	}

	public PresidentDTO(String id, String name, String countryName, String tenure) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

}
