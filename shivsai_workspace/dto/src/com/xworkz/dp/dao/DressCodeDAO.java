package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeDAO {

	private DressCodeDTO[] dressDTO = new DressCodeDTO[24];
	private int value = 0;
	
	public DressCodeDTO[] getDressDTO() {
		return dressDTO;
	}
	public void save(DressCodeDTO name) {
		if(this.value < dressDTO.length && name !=null) {
			dressDTO[this.value++]=name;
		}else {
		System.out.println("error");
		
		}
	}
public void delet(int index) {

if (index >= 0 &&  index < this.dressDTO.length) { 
	this.dressDTO[index]=null;
	System.out.println("index no".concat(String.valueOf(index).concat("is deleted")));
	
}
else {
	System.err.println("the passed index is not able to delet");
}
}
public void update(int no,DressCodeDTO code) {
		if(no >= 0 && no<dressDTO.length&&code!=null) {
			this.dressDTO[no]=code;
			System.out.println("index".concat(String.valueOf(no).concat("is updated by value")).concat(""));
		}
}
}