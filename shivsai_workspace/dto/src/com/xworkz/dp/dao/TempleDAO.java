package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TempleDTO;

public class TempleDAO {

	private TempleDTO[] templeDTO = new TempleDTO[24];
	private int value = 0;
	
	public TempleDTO[] getTempleDTO() {
		return templeDTO;
	}
	public void create(TempleDTO name) {
		if(this.value < templeDTO.length && name !=null) {
			templeDTO[this.value++]=name;
			System.out.println("creat method invoked:" . concat(String.valueOf(name)));
		}else {
		System.out.println("error");
		
		}
	}
public void delete(int index) {

if (index >= 0 &&  index < this.templeDTO.length) { 
	this.templeDTO[index]=null;
	System.out.println("index no".concat(String.valueOf(index).concat("is deleted")));
	
}
else {
	System.err.println("the passed index is not able to delet");
}
}
public void update(int no,TempleDTO code) {
		if(no >= 0 && no<templeDTO.length&&code!=null) {
			this.templeDTO[no]=code;
			System.out.println("index".concat(String.valueOf(no).concat("is updated by value")).concat(""));
		}
}
}

