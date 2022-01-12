package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tourist")
public class TouristEntity implements Serializable{
	
	@Id
	@Column(name = "t_id")
	private int tid;
	@Column(name = "t_location")
	private String location;
	@Column(name = "t_sealevel")
	private int sealevel;
	@Column(name = "t_famousFor")
	private String famousFor;
	@Column(name = "t_entryfees")
	private int entryfees;
	@Column(name = "t_season")
	private String season;

	public TouristEntity() {
		// TODO Auto-generated constructor stub
	}

	public TouristEntity(int tid, String location, int sealevel, String famousFor, int entryfees, String season) {
		super();
		this.tid = tid;
		this.location = location;
		this.sealevel = sealevel;
		this.famousFor = famousFor;
		this.entryfees = entryfees;
		this.season = season;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSealevel() {
		return sealevel;
	}

	public void setSealevel(int sealevel) {
		this.sealevel = sealevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public int getEntryfees() {
		return entryfees;
	}

	public void setEntryfees(int entryfees) {
		this.entryfees = entryfees;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "TouristEntity [tid=" + tid + ", location=" + location + ", sealevel=" + sealevel + ", famousFor="
				+ famousFor + ", entryfees=" + entryfees + ", season=" + season + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + tid;
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
		TouristEntity other = (TouristEntity) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (tid != other.tid)
			return false;
		return true;
	}

}
