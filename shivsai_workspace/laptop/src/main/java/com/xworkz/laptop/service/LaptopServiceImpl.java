package com.xworkz.laptop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.laptop.dao.LaptopDAO;
import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.exception.InvalidLaptopROM;
import com.xworkz.laptop.exception.InvalideLaptopBrand;
import com.xworkz.laptop.exception.InvalideLaptopColor;
import com.xworkz.laptop.exception.InvalideLaptopPrice;
import com.xworkz.laptop.exception.InvalideLaptopRAM;
import com.xworkz.laptop.exception.InvalidlaptopNameException;

@Service
public class LaptopServiceImpl implements LaptopService {

	private LaptopDAO laptopDAO;

	public LaptopServiceImpl(LaptopDAO laptopDAO) {
		this.laptopDAO = laptopDAO;
	}

	@Override
	public boolean validateLaptopDTO(LaptopDTO dto) throws InvalidlaptopNameException {
		System.out.println("invoked validateLaptopDTO()");
		boolean temp = false;

		if (dto.getLaptopName() != null && !(dto.getLaptopName().isEmpty()) && dto.getLaptopName().length() > 1
				&& dto.getLaptopName().length() < 10) {
			System.out.println("valid Laptop Name");
			temp = true;

		} else {
			InvalidlaptopNameException invalidName = new InvalidlaptopNameException("Invalid Laptop Name");
			throw invalidName;
		}
		if (dto.getLaptopBrand() != null && !(dto.getLaptopBrand().isEmpty()) && dto.getLaptopBrand().length() > 3
				&& dto.getLaptopBrand().length() < 15) {
			System.out.println("valid Laptop Brand");
			temp = true;

		} else {
			InvalideLaptopBrand invalidBrand = new InvalideLaptopBrand("Invalid Laptop Brand");
			throw invalidBrand;
		}
		if (dto.getLaptopColor() != null && !(dto.getLaptopColor().isEmpty()) && dto.getLaptopColor().length() > 3
				&& dto.getLaptopColor().length() < 10) {
			System.out.println("valid Laptop Color");
			temp = true;

		} else {
			InvalideLaptopColor invalidColor = new InvalideLaptopColor("Invalid Laptop Color");
			throw invalidColor;
		}

		if (dto.getLaptopPrice() != 0) {
			System.out.println("valid Laptop Price");
			temp = true;

		} else {
			InvalideLaptopPrice invalidPrice = new InvalideLaptopPrice("Invalid Laptop Price");
			throw invalidPrice;
		}
		if (dto.getLaptopRAM() != 0) {
			System.out.println("valid Laptop RAM");
			temp = true;

		} else {
			InvalideLaptopRAM invalidRAM = new InvalideLaptopRAM("Invalid Laptop RAM");
			throw invalidRAM;
		}
		if (dto.getLaptopROM() != 0) {
			System.out.println("valid Laptop ROM");
			temp = true;

		} else {
			InvalidLaptopROM invalidROM = new InvalidLaptopROM("Invalid Laptop ROM");
			throw invalidROM;
		}

		return temp;
	}

	@Override
	public boolean saveLaptopDTO(LaptopDTO laptopDTO) {
		System.out.println("invoked saveLaptopDTO");
		LaptopEntity entity = new LaptopEntity();
		BeanUtils.copyProperties(laptopDTO, entity);

		boolean isEntitySaved = laptopDAO.saveLaptopEntity(laptopDTO);
		return isEntitySaved;
	}

	@Override
	public LaptopDTO findByNameLaptopDTO(String name) {
		System.out.println("invoked findByNameLaptopDTO");
		LaptopEntity entity = this.laptopDAO.findByName(name);

		LaptopDTO dto = new LaptopDTO();
		BeanUtils.copyProperties(entity, dto);

		return LaptopService.super.findByNameLaptopDTO(name);
	}

	@Override
	public boolean DeleteLaptopDTO(String name) {
		System.out.println("invoked DeleteLaptopDTO() ");
		boolean result = this.laptopDAO.deleteByName(name);
		return result;
	}

	@Override
	public List<Object> getAllLaptopDTO() {
		System.out.println("invoked getAllLaptopDTO() ");
		List<Object> laptopContainer = null;
		List<LaptopEntity> laptopEntityContainer = this.laptopDAO.getAll();
		if (laptopEntityContainer != null) {
			return laptopContainer = new ArrayList<Object>(laptopEntityContainer);
		}
		return laptopContainer;
	}

	@Override
	public LaptopDTO UpdateByNameLaptopDTO(String laptopName, String laptopBrand, String laptopColor, double laptopPrice, double laptopRAM, double laptopROM) {

		return LaptopService.super.UpdateByNameLaptopDTO(laptopName, laptopBrand, laptopColor, laptopPrice, laptopRAM, laptopROM);
	}

}
