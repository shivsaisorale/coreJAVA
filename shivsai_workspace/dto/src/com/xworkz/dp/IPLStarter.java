package com.xworkz.dp;

import com.xworkz.dp.dao.IPLDAO;
import com.xworkz.dp.dto.IPLDTO;

public class IPLStarter {

	
	public static void main(String[] args) {
		IPLDTO ipldto= new IPLDTO("kohli","Vijaymalya","BSL",24,34);
		IPLDTO ipldto1= new IPLDTO("raina","sharukh","SL",24,34);
		IPLDTO ipldto2= new IPLDTO("dhoni","priti","ISL",25,34);
		IPLDTO ipldto3= new IPLDTO("mahi","vijay","LOL",27,34);
		
		IPLDAO ball=new IPLDAO();
		ball.save(ipldto);
		
		ball.create(new IPLDTO("mahi","vijay","LOL",27,34),8);
		ball.noOfIndexFull();
		ball.matchTeamByNAME("hanu");
		System.out.println("----------------");
		
		IPLDTO[] array=ball.getIpldtos();
		
		for(int a = 0; a <array.length; a++) {
			IPLDTO arr =array[a];
			System.out.println("================");
			if(arr !=null) {
				
				System.out.println("no of team: " +arr.getNoOfteams());
				System.out.println("no of size ".concat(String.valueOf(arr.getNoOfteams())));
				System.out.println("no name"+ arr.getOwner());
				System.out.println("name" .concat(String.valueOf(arr.getSponsor())));
			}else {
			System.out.println("error");
			}
		}
	}

}
