package com.xworkz.entity.dao;

import org.hibernate.sql.Update;

import com.xworkz.entity.CityEntity;

public interface CityDAO {


	public void create(CityEntity entity);

	public CityEntity getById(int Id);
	
	default void update( String newCity,int id) {
		return;
		
	}
	default void delete(int id) {
		
	}
}
