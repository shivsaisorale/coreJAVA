package com.xworkz.ipl.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "IPL")
public class IplEntity {
	@Id
	@Column(name = "I_iplid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iplid;
	@Column(name = "I_teamName")
	private String teamName;
	@Column(name = "I_owner")
	private String owner;
	@Column(name = "I_captain")
	private String captain;
	@Column(name = "I_sponsor")
	private String sponsor;
	@Column(name = "I_estDate")
	private LocalDateTime estDate;
	@Column(name = "I_budget")
	private String budget;

	public IplEntity(String teamName, String owner, String captain, String sponsor, LocalDateTime estDate,
			String budget) {
		super();
		
		this.teamName = teamName;
		this.owner = owner;
		this.captain = captain;
		this.sponsor = sponsor;
		this.estDate = estDate;
		this.budget = budget;
	}

}
