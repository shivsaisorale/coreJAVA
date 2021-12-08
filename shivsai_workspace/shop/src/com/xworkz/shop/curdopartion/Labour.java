package com.xworkz.shop.curdopartion;

public class Labour {

	private static final String LabourType = null;
	public String types;
	private String[] labourNames = new String[7];
	private int raja = 0;
	public String Labour;
	public int length;

	public Labour() {

	}

	public Labour(String LabourType) {
		this.Labour = LabourType;

	}

	public String getlabourType() {
		return LabourType;
	}

	public void addlabourNames(String name) {
		if (raja < this.labourNames.length) {
			this.labourNames[this.raja] = name;
			this.raja++;
			System.out.println("invoked the add Method,ver added:".concat(name));

		} else {
			System.err.println("Error the array is full cant add");
		}
	}

	public String[] getlabourNames() {
		return this.labourNames;
	}

	public void delete(int people) {
		if (people >= 0 && people < labourNames.length) {
			this.labourNames[people] = null;
			System.err.println("Error :cant be deleted");

		}
	}

}
