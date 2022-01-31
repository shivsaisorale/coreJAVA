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

	@Override
	public boolean validedateAndFind(String loginname, String password) {
		boolean valid = false;
		if (loginname != null && !(loginname.isEmpty()) && (password != null && !(password.isEmpty()))) {
			if (loginname.length() >= 8 && password.length() >= 8) {
				valid = dao.findLogin(loginname, password);
			}
		}
		return valid;

	}

	@Override
	public boolean validateAndChangePassword(String email, String newPassword) {
		boolean valid = false;

		if (email != null && !(email.isEmpty()) && email.contains("@") && (email.endsWith(".com"))){

			if (valid = true) {

				boolean valid1 = dao.findByEmail(email);
				if (valid1 = true) {
					if (newPassword != null && !(newPassword.isEmpty()) && !(newPassword.length() < 7)
							&& !(newPassword.length() > 16)) {
						dao.updatePasswordByEmail(email, newPassword);

					} 
					else {

						System.out.println("cannot update the password");
					}

				} 

			}
			else {
				System.out.println("invalid email");
			}
		}
		return valid;
		

	}
}
