package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.MedicineEntity;

public interface MedicineDAO {

	public void put(MedicineEntity medicineEntity);

	public void putAll(List<MedicineEntity> list);	
}
