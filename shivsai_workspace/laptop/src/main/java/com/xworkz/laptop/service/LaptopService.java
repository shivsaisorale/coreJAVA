package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDTO;


public interface LaptopService {

	boolean validateLaptopDTO(LaptopDTO dto);

	boolean saveLaptopDTO(LaptopDTO laptopDTO);

	default LaptopDTO findByNameLaptopDTO(String name) {
		return null;
	}

	default LaptopDTO UpdateByNameLaptopDTO(String laptopName, String laptopBrand, String laptopColor, double laptopPrice, double laptopRAM, double laptopROM
		) {
			return null;
	}

	boolean DeleteLaptopDTO(String name);

	List<Object> getAllLaptopDTO();
}
