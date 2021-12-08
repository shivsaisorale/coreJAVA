package com.xworkz.dp;


import com.xworkz.dp.dao.CamaraDAO;
import com.xworkz.dp.dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args, Object cameraDAO) {
		
		CameraDTO cameraDTO1 =new CameraDTO("yashica","sony","6",1000.f,123.0f);
		CameraDTO cameraDTO2 =new CameraDTO("c34","ganesh","4",3000.0f,34.0f);
		CameraDTO cameraDTO3 =new CameraDTO("canon","hanuman","3",2000.0f,67.0f);
		CameraDTO cameraDTO4 =new CameraDTO("DSLR","devi","3",6000.0f,23.0f);
		CameraDTO cameraDTO5 =new CameraDTO("canon","shiva","6",300008.0f,4000.5f);
		CameraDTO cameraDTO6 =new CameraDTO("Digital","ganesh","2",3876.0f,9999.5f);
	    
		CamaraDAO camaraDAO=new CamaraDAO();
		camaraDAO.creat(cameraDTO1);
		camaraDAO.creat(cameraDTO2);
		camaraDAO.creat(cameraDTO3);
		camaraDAO.creat(cameraDTO4);
	   
		CameraDTO[] cameraArray = ((CamaraDAO) cameraDAO).getDtos();
	    {

	for(int no =0; no < cameraArray.length;no++) {
		CameraDTO ref = cameraArray[no];
		 if (ref!=null) {
			 System.out.println("type : "+ref.getType());
			 System.out.println("comapany"+ref.getCompany());
			 System.out.println("pixel : " +ref.getPixel());
			 System.out.println("cost : " +ref.getCost());
			 System.out.println("weight :"+ref.getWeight());
			 System.out.println("----------------");
			 
		 }
	}
	    }

	}
}