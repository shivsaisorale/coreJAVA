package com.xworkz.bus;

public class BusRouterAssocition {

	BusRouterDAO dao;

	public BusRouterAssocition(BusRouterDAO dao) {

		this.dao = dao;

	}

	public void saveDetails(BusRouterDTO dto) {
		System.out.println("invoked savedetails");
		dao.save(dto);
	}

	public void displayDetails() {
		dao.display();
	}

	public void deleteAtIntex(int car) {
		dao.delete(car);

	}

	public void updateDetails(int car, BusRouterDTO dtos) {
		dao.update(car, dtos);
	}
}
