package com.xworkz.coffeday.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CoffeDay")
public class CoffeDayEntity {
	@Id
	@Column(name="c_id")
	int cid;
	@Column(name="c_location")
	String location;
	@Column(name="c_franchiseOwner")
	String franchiseOwner;
	@Column(name="c_startDate")
	LocalDate startDate;
	@Column(name="c_openTime")
	LocalTime openTime;
	@Column(name="c_closeTime")
	LocalTime closeTime;
	
	public CoffeDayEntity(int cid, String location, String franchiseOwner, LocalDate startDate, LocalTime openTime, LocalTime closeTime) {
		super();
		this.cid = cid;
		this.location = location;
		this.franchiseOwner = franchiseOwner;
		this.startDate = startDate;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	
	

	
	
	
	

}

