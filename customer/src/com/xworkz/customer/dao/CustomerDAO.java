package com.xworkz.customer.dao;

import com.xworkz.customer.CustomerDTO;

public interface CustomerDAO {
	void save(CustomerDTO entity);

	boolean findBy(int age);

	void updateroomNum(String roomnum);

}
