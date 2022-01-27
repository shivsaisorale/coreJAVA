package com.xworkz.dao;

import javax.xml.bind.ValidationException;

import com.xworkz.bar.entity.BarEntity;

public class BarServiceImpl implements BarService {

	private BarDAO dao;
	boolean valid = true;

	public BarServiceImpl() {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(BarEntity entity) {
		boolean valid = false;
		if (entity.getName() != null && entity.getName().isEmpty() && entity.getName().length() > 3
				&& entity.getName().length() < 25) {

		} else {
			System.out.println("invalid name");
              return false;
		}

		if (entity.getEmail() != null && entity.getEmail().isEmpty() && entity.getEmail().length() > 3
				&& entity.getEmail().length() < 25) {

		} else {
			System.out.println("invalid mail");
		}

		if (!(entity.getPhoNum() < 3) && !(entity.getPhoNum() > 50000000l)) {

		} else {
			System.out.println("invalid phonnum");

		}

		if (entity.getLocation() != null && entity.getLocation().isEmpty() && entity.getLocation().length() > 3
				&& entity.getLocation().length() < 25) {

		} else {
			System.out.println("invalid location");
		}

		if (entity.getOwner() != null && entity.getOwner().isEmpty() && entity.getOwner().length() > 3
				&& entity.getOwner().length() < 25) {

		} else {
			System.out.println("invalid owner");

		}

		if (!(entity.getNoOfbrands() < 3) && !(entity.getNoOfbrands() > 5000)) {

		} else {
			System.out.println("invalid NoOfbrands");

		}
		if (!(entity.getNoOfcustomer() < 3) && !(entity.getNoOfcustomer() > 500000)) {

		} else {
			System.out.println("invalid NoOfcustomer");

		}
		if (entity.getCreatedBy() != null && entity.getCreatedBy().isEmpty() && entity.getCreatedBy().length() > 3
				&& entity.getCreatedBy().length() < 25) {

		} else {
			System.out.println("invalide createdBy");

		}
		if (entity.getCreatedAt() != null) {
		} else {
			System.out.println("invalid createdAt");

		}
		if (entity.getUpdatedBy() != null && entity.getUpdatedBy().isEmpty() && entity.getUpdatedBy().length() > 3
				&& entity.getUpdatedBy().length() < 25) {
		} else {
			System.out.println("invalid updateBy");

		}
		if (entity.getUpdatedAt() != null) {

		} else {
			System.out.println("invalid updatedAt ");
		}
		if (valid) {
			dao.save(entity);
		}
		return false;
	}
}
