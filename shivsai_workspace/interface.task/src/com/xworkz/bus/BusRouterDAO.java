package com.xworkz.bus;

public interface BusRouterDAO {

	boolean save(BusRouterDTO bus);
	boolean delete(int index);
	boolean update(int index,BusRouterDTO busRef);
	void display();
	
}
