package com.xworkz.current.button;

public class Sock {

	private char size;
	private float price;
	private String type;
	
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Sock");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Sock");
		return 233;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Sock");
		if(obj!=null) {
			
			if(obj instanceof Sock) {
				
				Sock sock =(Sock)obj;
				String nameref=sock.getType();
				String type=sock.getType();
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
