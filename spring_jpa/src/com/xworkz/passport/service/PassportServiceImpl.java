package com.xworkz.passport.service;

import java.time.LocalDateTime;
import java.time.Year;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.repositery.PassportRepositery;
import com.xworkz.passport.repositery.PassportRepositeryImpl;

public class PassportServiceImpl implements PassportService {

	private PassportRepositery repo;

	 public PassportServiceImpl(PassportRepositery repo) {
	 this.repo=repo;
	 }

	@Override
	public boolean validateandsave(PassportEntity entity) {
		boolean valid = false;
		if (entity.getIssuedBy() != null && !(entity.getIssuedBy().isEmpty()) && !(entity.getIssuedBy().length() < 3)
				&& !(entity.getIssuedBy().length() > 135)) {
			valid = true;
		} else {
			System.out.println("invalid IssuedBy");
			valid = false;
			return valid;
		}

		if (entity.getIssuedAT() != null && (entity.getIssuedAT().isBefore(null) && (equals(entity)))) {
			valid = true;
		} else {
			System.out.println("invalid Issuedat");
			valid = false;
			return valid;

		}

		if (entity.getExpiresAt() != null) {
			valid = true;
		} else {
			System.out.println("invalid expires");
			valid = false;
			return valid;

		}
		if (entity.getGender() != null && entity.getExpiresAt().isAfter(entity.getIssuedAT().plusYears(10))) {
			valid = true;
		} else {
			System.out.println("invalid gender");
			valid = false;
			return valid;

		}

		if (entity.getAddress() != null && !(entity.getAddress().length() < 20)
				&& !(entity.getAddress().length() > 200)) {
			valid = true;
		} else {
			System.out.println("invalid adress");
			valid = false;
			return valid;

		}
		if (entity.getFullname() != null && !(entity.getFullname().length() < 10)
				&& !(entity.getFullname().length() > 200)) {
			valid = true;
		} else {
			System.out.println("invalid fullnmae");
			valid = false;
			return valid;

		}

		if (entity.getPassportPersonnelType() != null) {
			valid = true;
		} else {
			System.out.println("invalid passportpersontype");
			valid = false;
			return valid;

		}
		if (entity.getDob() != null && entity.getDob().isAfter(entity.getDob().minusYears(10))) {
			valid = true;
		} else {
			System.out.println("invalid dob");
			valid = false;
			return valid;

		}

		if (entity.getBloodGroup() != null) {
			valid = true;
		} else {
			System.out.println("invalid bloodgrup");
			valid = false;
			return valid;

		}

		if (entity.getVerifiedDocument() != null) {
			valid = true;
		} else {
			System.out.println("invalid verfieddoument");
			valid = false;
			return valid;

		}

		if (String.valueOf(entity.getPassporrtNo()).length() == 8
				&& !(entity.getPassporrtNo().toUpperCase().startsWith("A"))) {
			String regex = "^[A-PR-WYa-pr-wy][1-9]\\d" + "\\s?\\d{4}[1-9]$";

			valid = true;
		} else {
			System.out.println("invalid passportnum");
			valid = false;
			return valid;
		}

		return valid;

	}

}
