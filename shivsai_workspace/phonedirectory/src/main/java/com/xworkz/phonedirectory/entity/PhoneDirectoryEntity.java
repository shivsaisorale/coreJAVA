package com.xworkz.phonedirectory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Phone")
public class PhoneDirectoryEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_mobileNo")
	private long mobileNo;
	@Column(name = "p_adress")
	private String adress;
	@Column(name = "p_landMark")
	private String landMark;
	@Column(name = "p_landline")
	private long landline;
	@Column(name = "p_city")
	private String city;
	@Column(name = "p_pincode")
	private int pincode;

	public PhoneDirectoryEntity() {
		System.out.println("shotting on phone");
	}

	public PhoneDirectoryEntity(String name, long mobileNo, String adress, String landMark, long landline,
			String city, int pincode) {
		super();
		
		this.name = name;
		this.mobileNo = mobileNo;
		this.adress = adress;
		this.landMark = landMark;
		this.landline = landline;
		this.city = city;
		this.pincode = pincode;
	}

}
