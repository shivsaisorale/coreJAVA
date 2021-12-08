package com.xworkz.crud;

public class RocketStarter {

	private String materials;
	private String[] rocketNames = new String[8];
	private int count = 0;

	public RocketStarter() {
		this("aluminum");
		System.out.println("Invoked crudopertion no-arg const");
	}

	public RocketStarter(String materials) {
		this.materials = materials;
		System.out.println("Invoked BeachOpertor string const");
	}

	public String getwhisky() {
		return materials;
	}

	public void addrocketName(String name) {
		System.out.println("invoked addwhiskyName");
		System.out.println("Name of arg passed is :".concat(name));
		if (this.count < 8) {
			this.rocketNames[this.count] = name;
			this.count++;
		} else {
			System.err.println("array is full,cannot add ");
		}
	}

	public void displaywhiskyName() {
		System.out.println("invoked displaywhiskyName");
		for (int pickle = 0; pickle < this.rocketNames.length; pickle++) {
			String name = this.rocketNames[pickle];
			System.out.println(name);
		}
	
}

}
