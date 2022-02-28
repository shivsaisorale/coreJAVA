package com.xworkz.ather.dao;

import com.xworkz.ather.AtherBikeDTO;

public class AtherBikeDAO {

	private AtherBikeDTO[] dto = new AtherBikeDTO[3];
	private int num = 0;

	public AtherBikeDTO[] getDtos() {
		return dto;
	}
  
//	public void creat(AtherBikeDTO dto) {
//		if (this.num < dto.le && dto != null) {
//			System.out.println("creat method invoked :".concat(String.valueOf(dto)));
//		} else {
//			System.out.println("creat method invoked");
//		}
//	}

	public void delete(int index) {

		if (index < dto.length && index >= 0) {
			this.dto[index] = null;
			System.out.println("index no".concat(String.valueOf(index).concat("is deleted")));

		} else {
			System.err.println("it is delete ");
		}
	}

	public void update(int no, AtherBikeDTO code) {
		if (no < dto.length && no >= 0 && code != null) {
			this.dto[no] = code;
			System.out.println("index".concat(String.valueOf(no).concat("is updated by value")).concat(""));
		}
	}

}
