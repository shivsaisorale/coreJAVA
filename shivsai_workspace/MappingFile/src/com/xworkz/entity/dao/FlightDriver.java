package com.xworkz.entity.dao;

import com.xworkz.entity.FlightEntity;

public class FlightDriver {

	public static void main(String[] args) {

		FlightEntity entity = new FlightEntity();
		entity.setFid(1);
		entity.setFname("Bidar air port");
		entity.setFsource("air india");
		entity.setFdest("Bidar");

		FlightInterface flightEntity = new FlightImplementation();
		flightEntity.save(new FlightEntity());

	}

}
