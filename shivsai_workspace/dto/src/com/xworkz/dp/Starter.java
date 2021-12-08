package com.xworkz.dp;

import com.xworkz.dp.dto.BraceletDTO;

public class Starter {

	public static void main(String[] args) {
		
		BraceletDTO braceletDTO=new BraceletDTO();
		braceletDTO.setColour("Gold");
		braceletDTO.setMaterial("iron");
		braceletDTO.setPrice(25);
		braceletDTO.setGifted(false);
		braceletDTO.setGemUsed(true);
		
		BraceletDTO braceletDTO2=new BraceletDTO("green","plastic",15,true,false);
		BraceletDTO braceletDTO3=new BraceletDTO("red","plastic",15,true,false);
		BraceletDTO braceletDTO4=new BraceletDTO("white","plastic",15,true,false);
		BraceletDTO braceletDTO5=new BraceletDTO("purple","plastic",15,true,false);
		
		BraceletDTO[] bracelets=new BraceletDTO[5];
		
		bracelets[1] = braceletDTO2;
		bracelets[2] = braceletDTO4;
		bracelets[3] = braceletDTO5;
		bracelets[4] = braceletDTO3;
		
		for (int lock=0; lock<bracelets.length; lock++){
			
			BraceletDTO ref = bracelets [lock];
			if (ref != null) {
				
				System.out.println("Colour:".concat(ref.getColour()));
				System.out.println("Material:".concat(ref.getMaterial()));
				System.out.println("Price of Bracelet:".concat(String.valueOf(ref.getPrice())));
				System.out.println("is gem used in Bracelet:".concat(String.valueOf(ref.isGemUsed())));
				System.out.println("bracelet is gifted or not :".concat(String.valueOf(ref.isGifted())));
			}else {
				System.out.println(String.valueOf(lock).concat("nd index is pointing to null"));
		}
		
		
	}
}
}

