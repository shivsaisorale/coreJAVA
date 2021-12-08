package com.xworkz.current.button;

public class Aeroplane {

	int num;
	String company;
	String govt;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGovt() {
		return govt;
	}
	public void setGovt(String govt) {
		this.govt = govt;
	}
	@Override
	public String toString() {
		System.out.println("invoked tostring from Stadium");
		return "cricket";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Stadium");
		return 6547;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Stadium");
		if(obj!=null) {
			
			if(obj instanceof City) {
				
				Aeroplane aeroplane =(Aeroplane)obj;
				String nameref=aeroplane.getCompany();
				String type=aeroplane.getCompany();
				System.out.println(nameref+"=====");
				System.out.println(type+"=====");
				
				if(type.equals(nameref) && type.equals(type))

		{
			System.out.println("matched");
			return true;
		}
				
			}
		}
		return false;

	}

	
}
