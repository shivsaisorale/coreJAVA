package com.xworkz.entity.dao;


import com.xworkz.entity.StateEntity;

public interface StateDAO {


	public void create(StateEntity entity);

	

	public StateEntity getById(int Id);
	
	default void update( String newstate,int id) {
		return;
		
	}
	default void delete(int id) {
		
	}
}
