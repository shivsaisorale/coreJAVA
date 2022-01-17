package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.TouristEntity;

public interface TouristDAO {

	public void put(List<TouristEntity> touristEntity);

	void putAll(List<TouristEntity> entities);
}