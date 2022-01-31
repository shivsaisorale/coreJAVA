package com.xworkz.cycle.dao;

import com.xworkz.cycle.entity.CycleEntity;

public interface CycleDAO {

	
	void save(CycleEntity cycleEntity);
	boolean findshop(String product,String city);
	boolean findByCompany(String location);
}
