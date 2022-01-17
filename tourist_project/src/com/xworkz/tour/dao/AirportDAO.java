package com.xworkz.tour.dao;

import com.xworkz.tour.entity.AirportEntity;

import antlr.collections.List;

public interface AirportDAO {

	public void put(AirportEntity airportEntity);

	

	void putAll(java.util.List<AirportEntity> airport); 
}
