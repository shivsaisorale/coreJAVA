package com.xworkz.tour.dao;


import com.xworkz.tour.entity.RailwayStationEntity;

public interface RailwayStationDAO {

	public void put(RailwayStationEntity railwayStationEntity);

	void saveAll(java.util.List<RailwayStationEntity> airport); 
}

