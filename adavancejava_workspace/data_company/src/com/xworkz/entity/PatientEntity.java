package com.xworkz.entity;

public class PatientEntity {

	private int id ;
	private	String name;
	private	String birthPlace;
	private	int coronacases;
	private	int age;
	private	int buNo;
	
	public PatientEntity() {
		// TODO Auto-generated constructor stub
	}

	public PatientEntity(int id, String name, String birthPlace, int coronacases, int age, int buNo) {
		super();
		this.id = id;
		this.name = name;
		this.birthPlace = birthPlace;
		this.coronacases = coronacases;
		this.age = age;
		this.buNo = buNo;
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

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public int getCoronacases() {
		return coronacases;
	}

	public void setCoronacases(int coronacases) {
		this.coronacases = coronacases;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuNo() {
		return buNo;
	}

	public void setBuNo(int buNo) {
		this.buNo = buNo;
	}

	@Override
	public String toString() {
		return "PatientEntity [id=" + id + ", name=" + name + ", birthPlace=" + birthPlace + ", coronacases="
				+ coronacases + ", age=" + age + ", buNo=" + buNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientEntity other = (PatientEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
