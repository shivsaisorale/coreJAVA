package com.xworkz.customer.service;

import java.time.LocalDateTime;

import com.xworkz.customer.repository.CustomerRepository;
import com.xworkz.custumer.entity.CustomerEntity;

public class CustomberServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomberServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;

	}

	@Override
	public boolean validateandsave(CustomerEntity entity) {
		boolean valid = false;
		if (entity.getName() != null && !(entity.getName().length() < 5) && !(entity.getName().length() > 10)) {
			System.out.println(entity.getName());
			valid = true;
		} else {
			System.out.println("invalide name");
			valid = false;
			return valid;
		}

		if (entity.getLocation() != null && !(entity.getLocation().length() < 4)
				&& !(entity.getLocation().length() > 10)) {
			System.out.println(entity.getLocation());
			valid = true;
		} else {
			System.out.println("inalide location");
			valid = false;
			return valid;

		}
		if (entity.getEmail() != null && (entity.getEmail().contains("@")) && (entity.getEmail().endsWith(".com"))) {
			System.out.println(entity.getEmail());
			valid = true;
		} else {
			System.out.println("invalide email");
		}
//		if (String.valueOf(entity.getMobile()).length() == 10) {
//			System.out.println(entity.getMobile());
//			valid = true;
//		} else {
//			System.out.println("invalide mobile");
//		}
		if (valid) {
			customerRepository.save(entity);
		}
		return valid;

	}
}