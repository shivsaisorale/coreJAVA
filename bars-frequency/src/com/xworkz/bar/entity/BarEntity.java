package com.xworkz.bar.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "bars_deatils")
public class BarEntity implements Serializable {

	@Id
	@Column(name = "b_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_email")
	private String email;
	@Column(name = "b_phoNum")
	private long phoNum;
	@Column(name = "b_location")
	private String location;
	@Column(name = "b_owner")
	private String owner;
	@Column(name = "b_noOfbrands")
	private int noOfbrands;
	@Column(name = "b_quntity")
	private int quntity;
	@Column(name = "b_noOfcustomer")
	private int noOfcustomer;
	@Column(name = "b_createdBy")
	private String createdBy;
	@Column(name = "b_createdAt")
	private LocalDateTime createdAt;
	@Column(name = "b_updatedBy")
	private String updatedBy;
	@Column(name = "b_updatedAt")
	private LocalDateTime updatedAt;

	public BarEntity(String name, String email, long phoNum, String location, String owner, int noOfbrands, int quntity,
			int noOfcustomer, String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();

		this.name = name;
		this.email = email;
		this.phoNum = phoNum;
		this.location = location;
		this.owner = owner;
		this.noOfbrands = noOfbrands;
		this.quntity = quntity;
		this.noOfcustomer = noOfcustomer;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
