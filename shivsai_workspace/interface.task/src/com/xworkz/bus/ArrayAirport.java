package com.xworkz.bus;

public class ArrayAirport implements AirportDAO {

	AirportDTO[] airport = new AirportDTO[8];
	int counter = 0;

	@Override
	public boolean create(AirportDTO dto) {

		if (dto != null && this.counter < airport.length) {
			airport[this.counter++] = dto;
			System.out.println("Airport is open");
			return true;

		} else {
			System.out.println("Airport is not open");
		}
		return false;
	}

	@Override
	public boolean delete(int value) {
		if (value >= 0 && this.counter < airport.length) {
			airport[counter] = null;
			System.out.println("value is null");
			return true;

		} else {
			System.out.println("value is not null");
		}
		return false;
	}

	@Override
	public boolean update(int value, AirportDTO dto) {
		if (dto != null && value >= 0 && value < airport.length) {
			airport[counter] = null;
			System.out.println("it is update");
			return true;
		} else {
			System.out.println("it is not update");
		}
		return false;
	}

	@Override
	public void display() {
		for (int i = 0; i < airport.length; i++) {
			if (airport[i] != null) {
				System.out.println(airport[i].getId());
				System.out.println(airport[i].getLocation());
				System.out.println(airport[i].getName());
				System.out.println(airport[i].getType());
			}
		}
	}
}