package com.xworkz.exam;

public class State {

	String name; 
	int noOfdist;
	int noOfcitys;
	String CMname;
	
	public State(String name, int noOfdist, int noOfcitys, String cMname) {
		super();
		this.name = name;
		this.noOfdist = noOfdist;
		this.noOfcitys = noOfcitys;
		CMname = cMname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfstate() {
		return noOfdist;
	}

	public void setNoOfdist(int noOfdist) {
		this.noOfdist = noOfdist;
	}

	public int getNoOfcitys() {
		return noOfcitys;
	}

	public void setNoOfcitys(int noOfcitys) {
		this.noOfcitys = noOfcitys;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", noOfstate=" + noOfdist + ", noOfcitys=" + noOfcitys + ", CMname=" + CMname
				+ "]";
	}

	public String getCMname() {
		return CMname;
	}

	public void setCMname(String cMname) {
		CMname = cMname;
	}
	
	
	
	
}
