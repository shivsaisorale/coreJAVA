package com.xworkz.crud;

public class Crudopertion {

	private String testy;
	private String[] chocalateNames = new String[8];
	private int counter = 0;

	public Crudopertion() {
		this("yes");
		System.out.println("Invoked crudopertion no-arg const");
	}

	public Crudopertion(String testy) {
		this.testy = testy;
		System.out.println("Invoked BeachOpertor string const");
	}

	public String gettesty() {
		return testy;
	}

	public void addchocolateName(String name) {
		System.out.println("invoked addchocalateName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.counter < 8) {
			this.chocalateNames[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full,cannot add ");
		}
	}

	public void displayChocolateName() {
		System.out.println("invoked displayChocolateName");
		for (int cake = 0; cake < this.chocalateNames.length; cake++) {
			String name = this.chocalateNames[cake];
			System.out.println(name);
		}
	}

}
