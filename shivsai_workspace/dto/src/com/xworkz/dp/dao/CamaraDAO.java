package com.xworkz.dp.dao;


import com.xworkz.dp.dto.CameraDTO;
import com.xworkz.dp.dto.TempleDTO;


public class CamaraDAO {

		private CameraDTO[] dto = new CameraDTO[3];
		private int num = 0;
		
		public CameraDTO[] getDtos() {
			return dto;
		}
		
		public void creat(CameraDTO dto) {
			if(this.num<dto.length && dto !=null) {
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
			public void update(int no,CameraDTO code) {
					if(no <dto.length && no >= 0 &&code!=null) {
						this.dto[no]=code;
						System.out.println("index".concat(String.valueOf(no).concat("is updated by value")).concat(""));
					}
			}
			}


