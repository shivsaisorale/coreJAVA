package com.xworkz.vendor.dao;

import com.xworkz.vendor.entity.VendorEntity;

public interface VendorDAO {

	 void save(VendorEntity entity);
	 
	 boolean findLogin(String loginname,String password);
	 
	 boolean findByEmail(String email);
	 
	
	 void updatePasswordByEmail(String email,String pwd);

	
}
