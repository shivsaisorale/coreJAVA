package com.xworkz.bus;

public interface AirportDAO {

	boolean create(AirportDTO dto);
	boolean delete(int value);
	boolean update(int value,AirportDTO dto);
	void display();
	
}
