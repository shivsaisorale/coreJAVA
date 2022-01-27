package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {

	private VendorDAO dao;

	public VendorServiceImpl(VendorDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validAndSave(VendorEntity entity) {
		boolean valid = false;

		if (entity.getName() != null && !(entity.getName().isEmpty()) && !(entity.getName().length() < 5)
				&& !(entity.getName().length() > 30)) {
			valid = true;
		} else {
			System.out.println("invalid name");
			valid = false;
			return valid;
		}
		if (entity.getEmail() != null && (entity.getEmail().contains("@")) && (entity.getEmail().endsWith(".com"))
				|| (entity.getEmail().endsWith(".in"))) {
			valid = true;
		} else {
			System.out.println("invalid mail");
			valid = false;
			return valid;
		}

		if (entity.getLoginname() != null && !(entity.getLoginname().isEmpty()) && !(entity.getLoginname().length() < 8)
				&& !(entity.getLoginname().length() > 12)) {
			valid = true;
		} else {
			System.out.println("invlid name");
			valid = false;
			return valid;
		}
		if (entity.getAddress() != null && !(entity.getAddress().isEmpty()) && !(entity.getAddress().length() < 30)
				&& !(entity.getAddress().length() > 100)) {
			valid = true;
		} else {
			System.out.println("invlid adress");
			valid = false;
			return valid;
		}

		if (String.valueOf(entity.getGstno()).length() == 13) {
			valid = true;
		} else {
			System.out.println("invalid gst");
			valid = false;
			return valid;
		}
		if (valid) {
			dao.save(entity);
		}
		return valid;

	}
}
