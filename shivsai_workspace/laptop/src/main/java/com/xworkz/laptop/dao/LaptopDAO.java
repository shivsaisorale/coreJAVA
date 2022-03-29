package com.xworkz.laptop.dao;

import java.util.List;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopDAO {

	public boolean saveLaptopEntity(Object obj);

	default LaptopEntity findByName(String name) {
		return null;

	}

	default LaptopEntity upadteByName(LaptopEntity entity) {
		return null;
	}

	List<LaptopEntity> getAll();

	boolean deleteByName(String name);
}
