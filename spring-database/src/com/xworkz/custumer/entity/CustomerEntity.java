package com.xworkz.custumer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name = "customerservice")
@Entity
public class CustomerEntity {
	@Id
	@Column(name = "C_ID")
	private int id;
	@Column(name = "C_NAME")
	private String name;
	@Column(name = "C_LOCATION")
	private String location;
	@Column(name = "C_EMAIL")
	private String email;
	@Column(name = "C_MOBILE")
	private double mobile;
	@Column(name = "C_PREMIUM")
	private String premium;
	@Column(name = "C_AGE")
	int age;

	public CustomerEntity() {
		System.out.println("shotting custo");
	}

	public CustomerEntity(int id, String name, String location, String email, double mobile, String premium, int age) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.email = email;
		this.mobile = mobile;
		this.premium = premium;
		this.age = age;
	}
	

}
