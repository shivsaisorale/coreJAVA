package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RailwayStation")
public class RailwayStationEntity {
	@Id
	@Column(name = "r_id")
	private int id;
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_city")
	private String city;
	@Column(name = "r_NoOfcounter")
	private int NoOfcounter;
	@Column(name = "r_NoOfparking")
	private int NoOfparking;
	@Column(name = "r_plartform")
	private int plartform;

public RailwayStationEntity() {
	// TODO Auto-generated constructor stub
}

public RailwayStationEntity(int id, String name, String city, int noOfcounter, int noOfparking, int plartform) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	NoOfcounter = noOfcounter;
	NoOfparking = noOfparking;
	this.plartform = plartform;
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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getNoOfcounter() {
	return NoOfcounter;
}

public void setNoOfcounter(int noOfcounter) {
	NoOfcounter = noOfcounter;
}

public int getNoOfparking() {
	return NoOfparking;
}

public void setNoOfparking(int noOfparking) {
	NoOfparking = noOfparking;
}

public int getPlartform() {
	return plartform;
}

public void setPlartform(int plartform) {
	this.plartform = plartform;
}

@Override
public String toString() {
	return "RailwayStationEntity [id=" + id + ", name=" + name + ", city=" + city + ", NoOfcounter=" + NoOfcounter
			+ ", NoOfparking=" + NoOfparking + ", plartform=" + plartform + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + NoOfcounter;
	result = prime * result + NoOfparking;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + plartform;
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
	RailwayStationEntity other = (RailwayStationEntity) obj;
	if (NoOfcounter != other.NoOfcounter)
		return false;
	if (NoOfparking != other.NoOfparking)
		return false;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (plartform != other.plartform)
		return false;
	return true;
}

}
