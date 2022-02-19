package com.xworkz.coffeeday.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.xworkz.coffeeday.entity.CoffeeDayEntity;
import com.xworkz.coffeeday.repo.CoffeeDayRepository;
@Component
public class CoffeDayServiceImpl implements CoffeeDayService{

	@Autowired
	private CoffeeDayRepository repo;

	public CoffeDayServiceImpl(CoffeeDayRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateandsave(CoffeeDayEntity entity) {
		boolean valid = false;
		if (entity.getLocation() != null & !(entity.getLocation().length() < 8)
				&& !(entity.getLocation().length() > 15)) {
			valid = true;
			System.out.println(entity.getLocation());
		} else {
			valid = false;
			System.out.println("invalid location");

			if (entity.getFranchiseOwner() != null
					&& !(entity.getFranchiseOwner().length() < 6 && !(entity.getFranchiseOwner().length() > 12))) {
				valid = true;
				System.out.println(entity.getFranchiseOwner());
			} else {
				valid = false;
				System.out.println("invalid grachiseowner");
			}
			LocalDate tdy = LocalDate.now();
			if (entity.getStartDate() != null && entity.getStartDate().equals(tdy)
					&& entity.getStartDate().isAfter(tdy)) {
				System.out.println(entity.getStartDate());
				valid = true;
			} else {
				System.out.println("invalid started date");
				valid = false;
				return valid;

			}
			LocalTime today = LocalTime.now();
			if (entity.getOpenTime() != null && entity.getOpenTime().isBefore(today)) {
				valid = true;
				System.out.println(entity.getOpenTime());
			} else {
				valid = false;
				System.out.println("invalid opentime");
			}
			LocalTime today1 = LocalTime.now();
			if (entity.getCloseTime() != null && entity.getCloseTime().isBefore(today1)) {
				valid = true;
				System.out.println(entity.getCloseTime());
			} else {
				System.out.println("invalid closetime");
			}
		
		
		
	}
		return valid;
	}
}
