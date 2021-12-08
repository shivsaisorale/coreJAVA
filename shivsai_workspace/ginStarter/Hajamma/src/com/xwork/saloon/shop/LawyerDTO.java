package com.xwork.saloon.shop;

public class LawyerDTO {

	private String name;
	private String qualificatin;
	private int experience;
	private String gender;
	private int age;
	private String courtType;
	private int caseWon;
	private int caseLost;
	
	public LawyerDTO() {
		System.out.println("invoked no arg of const");
	}

	public LawyerDTO(String name, String qualificatin, int experience, String gender, int age, String courtType,
			int caseWon, int caseLost) {
		super();
		this.name = name;
		this.qualificatin = qualificatin;
		this.experience = experience;
		this.gender = gender;
		this.age = age;
		this.courtType = courtType;
		this.caseWon = caseWon;
		this.caseLost = caseLost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualificatin() {
		return qualificatin;
	}

	public void setQualificatin(String qualificatin) {
		this.qualificatin = qualificatin;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourtType() {
		return courtType;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public int getCaseWon() {
		return caseWon;
	}

	public void setCaseWon(int caseWon) {
		this.caseWon = caseWon;
	}

	public int getCaseLost() {
		return caseLost;
	}

	public void setCaseLost(int caseLost) {
		this.caseLost = caseLost;
	}
	
	
}
