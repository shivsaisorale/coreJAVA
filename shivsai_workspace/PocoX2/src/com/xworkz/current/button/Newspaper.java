package com.xworkz.current.button;

public class Newspaper {
	String name;
	String lang;
	String since;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getSince() {
		return since;
	}
	public void setSince(String since) {
		this.since = since;
	}
	
	@Override
	public String toString() {
		System.out.println("invoked tostring from Tyre");
		return "SSM";
	}
	@Override
	public int hashCode() {
		System.out.println("invoked hashcode from Tyre");
		return 654;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Tyre");
		if(obj!=null) {
			
			if(obj instanceof City) {
				
				Newspaper newspaper =(Newspaper)obj;
				String nameref=newspaper.getName();
				String type=newspaper.getName();
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
