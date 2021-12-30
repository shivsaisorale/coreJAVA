package com.xworkz.exam;

public class Actor {

	private String name;
	private char gender;
	private int age ;
	private boolean marrige;
	private String lang;
	
	public Actor(String name, char gender, int age, boolean marrige, String lang) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.marrige = marrige;
		this.lang = lang;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarrige() {
		return marrige;
	}

	public void setMarrige(boolean marrige) {
		this.marrige = marrige;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", gender=" + gender + ", age=" + age + ", marrige=" + marrige + ", lang=" + lang
				+ "]";
	}
	
	
	
	
}
