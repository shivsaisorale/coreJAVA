package com.xworkx.framework.collection.stream.map;

public class PersonDTO implements Comparable<PersonDTO> {

	private int id;
	private String name;
	private int age;
	private String email;

	public PersonDTO(int id, String name, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

	@Override
	public int compareTo(PersonDTO o) {
		return this.name.compareTo(o.getName());
	}

	public int compareTo1(PersonDTO b) {
		return b.name.compareTo(this.getEmail());
	}

}
