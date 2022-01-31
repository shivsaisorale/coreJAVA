package com.xworkz.cycle.service;

import com.xworkz.cycle.entity.CycleEntity;

public interface CycleService {

	void validAndSave(CycleEntity cycleEntity);
	
	boolean validcityAndlocation(String city ,String location);
	
}
