package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class StateEntity {

	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_noOfDistricts")
	private int noOfDistricts;
	@Column(name = "c_capitalcity")
	private String capitalcity;

	public StateEntity() {

	}

	public StateEntity(int id, String name, int noOfDistricts, String capitalcity) {
		super();
		this.id = id;
		this.name = name;
		this.noOfDistricts = noOfDistricts;
		this.capitalcity = capitalcity;
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

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public String getCapitalcity() {
		return capitalcity;
	}

	public void setCapitalcity(String capitalcity) {
		this.capitalcity = capitalcity;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noOfDistricts=" + noOfDistricts + ", capitalcity="
				+ capitalcity + "]";
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
		StateEntity other = (StateEntity) obj;
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
