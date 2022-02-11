package com.xworkz.dao;

import java.util.List;

public class Person {

	private String name;
	private List<String> bookNames;

	
	public void setName(String name) {
		this.name = name;
		System.out.println("shooting on name"+name);
	}
	
	public void setBookNames(List<String> bookNames) {
		this.bookNames = bookNames;
		System.out.println("shooting on setbooknames on list"+bookNames);
	}

}
