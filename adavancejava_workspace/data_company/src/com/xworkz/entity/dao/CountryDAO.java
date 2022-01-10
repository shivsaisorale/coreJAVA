package com.xworkz.entity.dao;

import com.xworkz.entity.CityEntity;
import com.xworkz.entity.CountryEntity;

public interface CountryDAO {

	public void create(CountryEntity entity);
	
 default  CountryEntity getById(int Id) {
		return null;
}
	
	default void update( String newcountry,int id) {
		return;
		
	}
	default void delete(int id) {
	}	
}
