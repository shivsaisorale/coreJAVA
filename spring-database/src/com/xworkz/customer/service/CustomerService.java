package com.xworkz.customer.service;

import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.customer.repository.CustomerRepositoryImpl;
import com.xworkz.custumer.entity.CustomerEntity;

public interface CustomerService {

	public boolean validateandsave(CustomerEntity entity);
}
