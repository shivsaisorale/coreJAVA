package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.TouristEntity;

public interface TouristDAO {

	
	void put(List<TouristEntity> touristEntity);

	void addAll(List<TouristEntity> entities);

	void put(TouristEntity entity);
}