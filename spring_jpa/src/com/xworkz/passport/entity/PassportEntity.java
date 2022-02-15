package com.xworkz.passport.entity;

import java.time.LocalDateTime;

import com.xworkz.passport.constant.BloodGroup;
import com.xworkz.passport.constant.Gender;
import com.xworkz.passport.constant.PassportPersonnelType;
import com.xworkz.passport.constant.VerifiedDocument;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassportEntity {

	private int pid;
	private String issuedBy;
	private LocalDateTime issuedAT;
	private LocalDateTime expiresAt;
	private Gender gender;
	private String PassporrtNo;
	private String address;
	private String fullname;
	private String legalIssue;
	private PassportPersonnelType passportPersonnelType;
	private LocalDateTime dob;
	private BloodGroup bloodGroup;
	private VerifiedDocument verifiedDocument;

	public PassportEntity(int pid, String issuedBy, LocalDateTime issuedAT, LocalDateTime expiresAt, Gender gender,
			String passporrtNo, String address, String fullname, String legalIssue,
			PassportPersonnelType passportPersonnelType, LocalDateTime dob, BloodGroup bloodGroup,
			VerifiedDocument verifiedDocument) {
		super();
		this.pid = pid;
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
