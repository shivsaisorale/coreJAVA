package com.xworkz.current.button;

public class IceCream {

	private String name;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from icecream");
		return "it is cold icecream";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from icecream");
		return 233;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from icecream");
		if(obj!=null) {
			
			if(obj instanceof IceCream) {
				
				IceCream kone =(IceCream)obj;
				String nameref=kone.getName();
				String type=kone.getType();
				System.out.println(nameref+"=====");
				System.out.println(type+"=====");
				
				if(name.equals(nameref) && type.equals(type))

		{
			System.out.println("matched");
			return true;
		}
				
			}
		}
		return false;
	}
	
	}
	

