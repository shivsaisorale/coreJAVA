package com.xworkz.passport.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.passport.constant.BloodGroup;
import com.xworkz.passport.constant.Gender;
import com.xworkz.passport.constant.PassportPersonnelType;
import com.xworkz.passport.constant.VerifiedDocument;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "passport")
public class PassportEntity {
	@Id
	@Column(name = "pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column(name = "issuedBy")
	private String issuedBy;
	@Column(name = "issuedAT")
	private LocalDateTime issuedAT;
	@Column(name = "expiresAt")
	private LocalDateTime expiresAt;
	@Column(name = "gender")
	private Gender gender;
	@Column(name = "PassporrtNo")
	private String PassporrtNo;
	@Column(name = "address")
	private String address;
	@Column(name = "fullname")
	private String fullname;
	@Column(name = "legalIssue")
	private String legalIssue;
	@Column(name = "passportPersonnelType")
	private PassportPersonnelType passportPersonnelType;
	@Column(name = "dob")
	private LocalDateTime dob;
	@Column(name = "bloodGroup")
	private BloodGroup bloodGroup;
	@Column(name = "verifiedDocument")
	private VerifiedDocument verifiedDocument;

	public PassportEntity(String issuedBy, LocalDateTime issuedAT, LocalDateTime expiresAt, Gender gender,
			String passporrtNo, String address, String fullname, String legalIssue,
			PassportPersonnelType passportPersonnelType, LocalDateTime dob, BloodGroup bloodGroup,
			VerifiedDocument verifiedDocument) {
		super();
		
		this.issuedBy = issuedBy;
		this.issuedAT = issuedAT;
		this.expiresAt = expiresAt;
		this.gender = gender;
		PassporrtNo = passporrtNo;
		this.address = address;
		this.fullname = fullname;
		this.legalIssue = legalIssue;
		this.passportPersonnelType = passportPersonnelType;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.verifiedDocument = verifiedDocument;
	}

}
