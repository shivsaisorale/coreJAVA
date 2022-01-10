package com.xworkz.entity.dao;


import com.xworkz.entity.PatientEntity;

public interface PatitentEntityDAO {

	public void create(PatientEntity entity);
	default  PatientEntity getById(int Id) {
		return null;
}
	
	default void update( String newpet,int id) {
		return;
		
	}
	default void delete(int id) {
	}	
}
