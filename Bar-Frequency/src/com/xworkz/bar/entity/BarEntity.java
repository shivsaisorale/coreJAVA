package com.xworkz.bar.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name ="Bar")
public class BarEntity {

	@Id
	@Column(name = "b_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_email")
	private String email;
	@Column(name = "b_phonNum")
	private boolean phonNum;
	@Column(name = "b_location")
	private String location;
	@Column(name = "b_owner")
	private String owner;
	@Column(name = "b_entryfees")
	private int entryfees;
	@Column(name = "b_noOfbrands")
	private int noOfbrands;
	@Column(name = "b_food")
	private boolean food;
	@Column(name = "b_numOFflowers")
	private int numOFflowers;
	@Column(name = "b_createdBy")
	private String createdBy;
	@Column(name = "b_createdAt")
	private LocalDateTime createdAt;
	@Column(name = "b_updatedBy")
	private String updatedBy;
	@Column(name = "b_updatedAt")
	private LocalDateTime updatedAt;
	
	public BarEntity(String name, String email, boolean phonNum, String location, String owner, int entryfees,
			int noOfbrands, boolean food, int numOFflowers, String createdBy, LocalDateTime createdAt, String updatedBy,
			LocalDateTime updatedAt) {
		super();
		
		this.name = name;
		this.email = email;
		this.phonNum = phonNum;
		this.location = location;
		this.owner = owner;
		this.entryfees = entryfees;
		this.noOfbrands = noOfbrands;
		this.food = food;
		this.numOFflowers= numOFflowers;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

	
}
