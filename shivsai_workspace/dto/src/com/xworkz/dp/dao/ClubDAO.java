package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ClubDTO;

public class ClubDAO {


	private ClubDAO[] dto = new ClubDAO[3];
	private int yanne = 0;
	
	public ClubDTO[] getClubDTO() {
		return club;
	}
	
	public  void creat(ClubDTO dto) {
		if(this.yanne<club.length && dto !=null) {
			club[this.yanne++]=dto;
			System.out.println("creat method invoked :" .concat(String.valueOf(dto)));
		}else {
			System.out.println("creat method invoked");
			}
		}
	public void delete(int index) {

		if (index <dto.length && index >=0) { 
			this.dto[index]=null;
			System.out.println("index no".concat(String.valueOf(index).concat("is deleted")));
			
		}
		else {
			System.err.println("the passed index is not able to delet");
		}
		}
		public void update(int no,ClubDAO code) {
				if(no <dto.length && no >= 0 &&code!=null) {
					this.dto[no]=code;
					System.out.println("index".concat(String.valueOf(no).concat("is updated by value")).concat(""));
				}
		}
		}
