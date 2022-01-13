package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class AirportEntity {
	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_manegerName")
	private String ManegerName;
	@Column(name = "a_location")
	private String location;
	@Column(name = "a_dailyFlight")
	private int dailyFlight;
	@Column(name = "a_weeklyFlight")
	private int weeklyFlight;

	public AirportEntity() {
		// TODO Auto-generated constructor stub
	}

	public AirportEntity(int id, String name, String manegerName,String location, int dailyFlight,int weeklyFlight) {
		super();
		this.id = id;
		this.name = name;
		this.ManegerName = manegerName;
		this.location = location;
		this.dailyFlight = dailyFlight;
		this.weeklyFlight = weeklyFlight;
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

	public String getManegerName() {
		return ManegerName;
	}

	public void setManegerName(String manegerName) {
		ManegerName = manegerName;
	}

	public int getDailyFlight() {
		return dailyFlight;
	}

	public void setDailyFlight(int dailyFlight) {
		this.dailyFlight = dailyFlight;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWeeklyFlight() {
		return weeklyFlight;
	}

	public void setWeeklyFlight(int weeklyFlight) {
		this.weeklyFlight = weeklyFlight;
	}

	@Override
	public String toString() {
		return "AirportEntity [id=" + id + ", name=" + name + ", ManegerName=" + ManegerName + ", dailyFlight="
				+ dailyFlight + "]";
	}

}
