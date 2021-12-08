package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;

public class CircusDAO {

	private CircusDTO[] circusDTOs=new CircusDTO[15];
	private int kiran=0;
	private int cat;
	
	public  CircusDAO() {
		System.out.println("invoked the no-parameterized constructor");
	}
	public CircusDTO[] getCircusDAOs() {
		return circusDTOs;
	}
	public void creat(CircusDTO name) {
		System.out.println("invoked the creat method");
		if(kiran<this.circusDTOs.length) {
			this.circusDTOs[this.kiran++]=name;
			System.out.println("creat the cricus name:"+name.getMaterial());
		}else {
			System.out.println("index is full");
		}
	}
	public void save(CircusDTO name,int ro) {
		System.out.println("invoked the create by two parameter or overloding");
		if(kiran<this.circusDTOs.length&&name!=null&&ro>0) {
			this.circusDTOs[ro++]=name;

		}else {
			System.out.println("index is full in overloading");
		}
	}
	public void Indexoccupied() {
		System.out.println("indexoccupied : "+kiran);
	}
	public boolean ani(String owner) {
		for(int cat=0;cat<this.circusDTOs.length;cat++);{
			CircusDTO ref=circusDTOs[cat];
			if(ref!=null) {
				System.out.println("refrence of index is not full:".concat(String.valueOf(ref)));
				String ref1=ref.getOwner();
				if(owner.equals(ref1)) {
			}
			
		}
	}
		return false;
	}
}
