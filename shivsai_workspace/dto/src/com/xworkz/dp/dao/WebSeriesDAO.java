package com.xworkz.dp.dao;
import com.xworkz.dp.dto.*;

import com.xworkz.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] dto=new WebSeriesDTO[3];
	private int temp=0;
	
	public void webSeriesNames(WebSeriesDTO webSeriesDTO1) {
		if(temp   < this.dto.length && webSeriesDTO1 !=null) {
			this.dto[this.temp++]=webSeriesDTO1;
			System.out.println("create method invoked:".concat(String.valueOf(webSeriesDTO1)));
		}else {	
			System.out.println("creat method invalid");
		}
} 
	public WebSeriesDTO[] getDto() {
		return dto;
		}


	public void delet(int index) {
		if(index <dto.length && index >=0) {
			this.dto[index]=null;
			System.out.println("delete method invoked :".concat(String.valueOf(index)));
		}else {
			System.out.println("delet method invaluis:");
		}
		}

	public void updated(int index,WebSeriesDTO name) {
		if(index < dto.length && index >= 0 && name != null) {
			this.dto[index]=name;
System.out.println("updated method invoked:".concat(String.valueOf(index)).concat(null));
		}else {
			System.err.println("update method invalid");
			
		}
	}


}