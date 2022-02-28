package com.xworkz.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.xworkz.internet.Internet;

public class Entity {
	@Value("goggle")
	private String name;
	@Value("v24.45")
	private String version;

	@Autowired
	@Qualifier("jiointernet")
	private Internet internet;

	@Autowired
	@Qualifier("AirtelInternet")
	private Internet internet1;

	
}
