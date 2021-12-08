package com.xworkz.bus;

public class AirportAssociation {

	AirportDAO plane;
	
	public AirportAssociation(AirportDAO plane) {
		this.plane=plane;
	}

	public void createDetails(AirportDTO dto) {
		System.out.println("invoked savedetails");
		plane.create(dto);
	}

	public void displayDetails() {
		plane.display();
	}

	public void deleteAtIntex(int value) {
		plane.delete(value);

	}

	public void updateDetails(int value, AirportDTO dto) {
		plane.update(value, dto);
	}

}
