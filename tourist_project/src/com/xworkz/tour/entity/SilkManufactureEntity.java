package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "silkManufacturing")

public class SilkManufactureEntity {
	@Id
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_location")
	private String location;
	@Column(name = "s_perQuality")
	private int per_quantity;
	@Column(name = "s_season")
	private String season;
	@Column(name = "s_colour")
	private String colour;
	@Column(name = "s_noOfCloth")
	private String noOfCloth;

	public SilkManufactureEntity() {
		// TODO Auto-generated constructor stub
	}

	public SilkManufactureEntity(int id, String name, String location, int per_quantity, String season,String colour,String noOfCloth) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.per_quantity = per_quantity;
		this.season = season;
		this.colour=colour;
		this. noOfCloth=noOfCloth;
		
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPer_quantity() {
		return per_quantity;
	}

	public void setPer_quantity(int per_quantity) {
		this.per_quantity = per_quantity;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getNoOfCloth() {
		return noOfCloth;
	}

	public void setNoOfCloth(String noOfCloth) {
		this.noOfCloth = noOfCloth;
	}

	@Override
	public String toString() {
		return "SilkManufactureEntity [id=" + id + ", name=" + name + ", location=" + location + ", per_quantity="
				+ per_quantity + ", season=" + season + "]";
	}

}
