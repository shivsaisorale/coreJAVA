package com.xworkz.ather;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AtherBikeDTO {
	int num;
	String name;
	String colour;
	String company;
	float price;
	String createdBy;
	LocalDate createdAt;
	String updatedBy;
	LocalDate updatedAt;
	
	public AtherBikeDTO(int num, String name, String colour, String company, float price, String createdBy,
			LocalDate createdAt, String updatedBy, LocalDate updatedAt) {
		super();
		this.num = num;
		this.name = name;
		this.colour = colour;
		this.company = company;
		this.price = price;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

	
}
