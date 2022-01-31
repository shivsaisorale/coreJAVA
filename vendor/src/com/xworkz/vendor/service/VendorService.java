package com.xworkz.vendor.service;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorService {

	boolean validAndSave(VendorEntity entity);
	
	
boolean validedateAndFind(String loginname,String password);

boolean validateAndChangePassword(String email,String newPassword);
}
