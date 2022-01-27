package com.xworkz.dao;

import javax.xml.bind.ValidationException;

import com.xworkz.bar.entity.BarEntity;

public class BarServiceImpl implements BarService {

	private BarDAO dao;

	public BarServiceImpl(BarDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(BarEntity entity) {
		boolean valid = false;
//		if (entity.getName() != null && !(entity.getName().isEmpty()) && !(entity.getName().length() < 3)
//				&& !(entity.getName().length() > 25)) {
//			valid = true;
//		} else {
//			System.out.println("invalid name");
//			valid = false;
//			return valid;
//		}

		if (entity.getEmail() != null && !(entity.getEmail().isEmpty()) && !(entity.getEmail().length() < 6)
				&& !(entity.getEmail().length() > 25)) {
			valid = true;

		} else {
			System.out.println("invalid mail");
			valid = false;
			return valid;
		}

//		if (!(entity.getPhoNum() < 3) && (entity.getPhoNum() > 50000000l)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid phonnum");
//			valid = false;
//			return valid;
//		}
//
//		if (entity.getLocation() != null && !(entity.getLocation().isEmpty()) && !(entity.getLocation().length() <3)
//				&& !(entity.getLocation().length() >25)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid location");
//			valid = false;
//			return valid;
//		}
//
//		if (entity.getOwner() != null && !(entity.getOwner().isEmpty()) && !(entity.getOwner().length() < 3)
//				&& !(entity.getOwner().length() >25)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid owner");
//			valid = false;
//			return valid;
//
//		}
//
//		if (!(entity.getNoOfbrands() < 3) && !(entity.getNoOfbrands() > 5000)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid NoOfbrands");
//			valid = false;
//			return valid;
//
//		}
//		if (!(entity.getNoOfcustomer() < 3) && (entity.getNoOfcustomer() > 500000)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid NoOfcustomer");
//			valid = false;
//			return valid;
//
//		}
//		if (entity.getCreatedBy() != null && !(entity.getCreatedBy().isEmpty()) && !(entity.getCreatedBy().length() > 3)
//				&& !(entity.getCreatedBy().length() < 25)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalide createdBy");
//			valid = false;
//			return valid;
//
//		}
//		if (entity.getCreatedAt() != null) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid createdAt");
//			valid = false;
//			return valid;
//
//		}
//		if (entity.getUpdatedBy() != null && !(entity.getUpdatedBy().isEmpty()) && !(entity.getUpdatedBy().length() > 3)
//				&& !(entity.getUpdatedBy().length() < 25)) {
//			valid = true;
//
//		} else {
//			System.out.println("invalid updateBy");
//			valid = false;
//			return valid;
//
//		}
//		if (entity.getUpdatedAt() != null) {
//			valid = false;
//
//		} else {
//			System.out.println("invalid updatedAt ");
//			valid = false;
//			return valid;
//		}
		if (valid) {
			dao.save(entity);
		}
		return false;
	}
}
