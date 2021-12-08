package com.xworkz.bus;

public class ArrayBusRouterDAO implements BusRouterDAO {

	BusRouterDTO[] routerdto = new BusRouterDTO[5];
	int counter = 0;

	@Override
	public boolean save(BusRouterDTO bus) {
		if (bus != null && this.counter < routerdto.length) {
			this.routerdto[this.counter++] = bus;
			System.out.println("it is save");
			return true;

		} else {
			System.out.println("it is not save");

		}
		return false;
	}

	@Override
	public boolean delete(int car) {
		if (car >= 0 && car < this.routerdto.length) {
			routerdto[car] = null;
			System.out.println("it is delete" + car);
			return true;

		} else {
			System.err.println("it is not delete");
		}
		return false;

	}

	@Override
	public boolean update(int car, BusRouterDTO bus) {
		if (bus != null && car >= 0 && car < this.routerdto.length) {
			routerdto[car] = bus;
			System.out.println("it is update" + car);
			return true;
		}
		System.out.println("it is not update");
		return false;

	}

	@Override
	public void display() {
		for (int i = 0; i < routerdto.length; i++) {
			if (routerdto[i] != null) {
				System.out.println(routerdto[i].getId());
				System.out.println(routerdto[i].getDestination());
				System.out.println(routerdto[i].getDriverName());
				System.out.println(routerdto[i].getStarPoint());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
	}
}