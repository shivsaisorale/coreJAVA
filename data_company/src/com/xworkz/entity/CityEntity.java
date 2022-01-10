package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class CityEntity {

	@Id
	@Column(name = "c_id")
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_population")
	private double population;
	@Column(name = "c_famousFor")
	private String famousFor;
	@Column(name = "c_coronaZon")
	private String coronaZone;

	public CityEntity() {

	}

	public CityEntity(int id, String name, double population, String famousFor, String coronaZone) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousFor = famousFor;
		this.coronaZone = coronaZone;
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

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getCoronaZone() {
		return coronaZone;
	}

	public void setCoronaZone(String coronaZone) {
		this.coronaZone = coronaZone;
	}

	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", population=" + population + ", famousFor=" + famousFor
				+ ", coronaZone=" + coronaZone + "]";
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
		CityEntity other = (CityEntity) obj;
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
