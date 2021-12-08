package com.xworkz.dp;


import com.xworkz.dp.dao.TempleDAO;
import com.xworkz.dp.dto.TempleDTO;

public class TempleStarter {

	public static void main(String[] args) {
		TempleDTO templeDTO1 = new TempleDTO("red", "saibaba", "BTM", 10.f, true);
		TempleDTO templeDTO2 = new TempleDTO("black", "ganesh", "Bidar", 3.0f, true);
		TempleDTO templeDTO3 = new TempleDTO("blue", "hanuman", "Jayadev", 2.0f, false);
		TempleDTO templeDTO4 = new TempleDTO("yellow", "devi", "BTM 2nd", 6.0f, true);
		TempleDTO templeDTO5 = new TempleDTO("black", "shiva", "BTM 3rd", 3.0f, true);
		TempleDTO templeDTO6 = new TempleDTO("green", "ganesh", "BTM 1st", 3.0f, true);

		TempleDAO temDao=new TempleDAO();
		temDao.create(templeDTO1);
		temDao.create(templeDTO2);
		temDao.create(templeDTO3);
		temDao.create(templeDTO4);
		temDao.create(templeDTO5);
		
		TempleDTO[] templeArray = temDao.getTempleDTO();
	    {
		
			
			for (int no = 0; no < templeArray.length; no++) {
				TempleDTO ref = templeArray[no];
				if (ref != null) {
					System.out.println("temple colour : " + ref.getColour());
					System.out.println("temple name" + ref.getName());
					System.out.println("location: " + ref.getLocation());
					System.out.println("yest gante: " + ref.getYestGante());
					System.out.println("prasada" + ref.isPrasada());
					System.out.println("----------------");

				}
			}
		}
	}
	}

