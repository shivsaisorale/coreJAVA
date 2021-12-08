package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {
		
		
		DressCodeDTO dressCodeDTO1 =new DressCodeDTO("red","23","M","cotton",100.0f,true);
	    DressCodeDTO dressCodeDTO2 =new DressCodeDTO("black","34","XL","soft",300.0f,true);
	    DressCodeDTO dressCodeDTO3 =new DressCodeDTO("blue","32","XL","soft",200.0f,false);
	    DressCodeDTO dressCodeDTO4 =new DressCodeDTO("yellow","34","XL","soft",300.0f,true);
	    DressCodeDTO dressCodeDTO5 =new DressCodeDTO("black","34","XL","soft",300.0f,true);
	    DressCodeDTO dressCodeDTO6 =new DressCodeDTO("green","34","XL","soft",300.0f,true);
	    
	    DressCodeDAO dressCodeDAO=new DressCodeDAO();
	    dressCodeDAO.save(dressCodeDTO1);
	    dressCodeDAO.save(dressCodeDTO2);
	    dressCodeDAO.save(dressCodeDTO3);
	    dressCodeDAO.save(dressCodeDTO4);
	    dressCodeDAO.save(dressCodeDTO5);
	    dressCodeDAO.save(dressCodeDTO6);
	   
	    DressCodeDTO[] dressArray = dressCodeDAO.getDressDTO();
	    {

	for(int no =0; no < dressArray.length;no++) {
		DressCodeDTO ref = dressArray[no];
		 if (ref!=null) {
			 System.out.println("Dress colour : "+ref.getColour());
			 System.out.println("cast : "+ref.getCast());
			 System.out.println("size : " +ref.getSize());
			 System.out.println("material : " +ref.getMaterial());
			 System.out.println("price"+ref.getPrice());
			 System.out.println("----------------");
		 }
	}
}
}
}