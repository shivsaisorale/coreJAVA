package com.xworkz.laptop.service;

import org.springframework.stereotype.Component;

import com.xworkz.laptop.dao.LaptopDAO;
import com.xworkz.laptop.dto.LaptopDTO;

@Component
public class LaptopServiceImpl implements LaptopService {

	private LaptopDAO laptopDAO;

	public LaptopServiceImpl(LaptopDAO laptopDAO) {
		this.laptopDAO = laptopDAO;
	}

	@Override
	public boolean validLaptopdto(LaptopDTO dto) {
		boolean temp = false;
		if (dto.getLaptopName() != null && !dto.getLaptopName().isEmpty()) {
			System.out.println("laptopName is valid");

		} else {
			System.out.println("laptopname is invalid");
		}
		if (dto.getLaptopBrand() != null && !dto.getLaptopBrand().isEmpty()) {
			System.out.println("LaptopBrand is valid");

		} else {
			System.out.println("LaptopBrand is invalid");
		}
		if (dto.getLaptopRAM() > 0) {
			System.out.println("LaptopRAM is valid");

		} else {
			System.out.println("LaptopRAM is invalid");
		}
		if (dto.getLaptopROM() > 0) {
			System.out.println("LaptopROM is valid");

		} else {
			System.out.println("LaptopROM is invalid");
		}
		if (dto.getLaptopPrice() > 0) {
			System.out.println("LaptopPrice is valid");

		} else {
			System.out.println("LaptopPrice is invalid");
		}
		if (dto.getLaptopColor() != null && !dto.getLaptopColor().isEmpty()) {
			System.out.println("LaptopColor is valid");

		} else {
			System.out.println("LaptopColor is invalid");
		}
	
			
		
		return false;

	}

}
