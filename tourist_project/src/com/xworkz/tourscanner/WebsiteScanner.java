package com.xworkz.tourscanner;

import com.xworkz.entity.DAO.WebsiteDAO;
import com.xworkz.entity.DAO.WebsiteDAOImpl;
import com.xworkz.website.WebsiteEntity;

public class WebsiteScanner {

	public static void main(String[] args) {
		
		WebsiteEntity websiteEntity=new WebsiteEntity( "Guru Nanak Dev", "www.gnducb.ac.in", 1980, "S.Balbir Sinsgh", ".com.gndecb.ac.in");
		WebsiteEntity websiteEntity1=new WebsiteEntity( "cricket", "www.cricket.icc-cricket.com", 1880, "Gangoly", "com.cricket.icc-cricket");
		WebsiteEntity websiteEntity2=new WebsiteEntity( "Kabbadi", "www.prokabbadi.com", 2008, "Nitish", "com.prokabbadi");
		WebsiteEntity websiteEntity3=new WebsiteEntity( "Football", "www.espn.in", 2001, "sheikh Mansour", "com.football");
		WebsiteEntity websiteEntity4=new WebsiteEntity( "VTU", "VTU.ac.in", 1990, "karibasappa", "com.vtu.ac.in");
		WebsiteEntity websiteEntity5=new WebsiteEntity( "VTU", "Reslts.vtu.ac.in", 1990, "karibasappa", "com.vturesult.ac.in");
		WebsiteEntity websiteEntity6=new WebsiteEntity( "flim", "www.slashflim.com", 1999, "nagappa", "com.flim");
		WebsiteEntity websiteEntity7=new WebsiteEntity( "song", "www.song.com", 1940, "Dr.rajakumar", "com.song");
		WebsiteEntity websiteEntity8=new WebsiteEntity( "hotels", "www.makemytrip.com", 2000, "sangappa", "com.hotels");
		WebsiteEntity websiteEntity9=new WebsiteEntity( "shaadi", "www.shaadi.com", 2001, "Anupam", "com.anupam");
		WebsiteEntity websiteEntity10=new WebsiteEntity( "Amezone", "www.Amezone.com", 1996, "andizessi", "com.amezone");
		WebsiteEntity websiteEntity11=new WebsiteEntity( " 91mobile ", "www.91mobile.com", 2010, "tata", "com.91mobile");
		WebsiteEntity websiteEntity12=new WebsiteEntity( "tata", "www.tataacliq.com", 2003, "S.Balbir Sinsgh", "com.tatacar");
		WebsiteEntity websiteEntity13=new WebsiteEntity( "pubgi", "www.pubgi.com", 2019, "Brendan Greene", "com.pubgi");
		WebsiteEntity websiteEntity14=new WebsiteEntity( "HP", "www.hplaptop.in", 2000, "Devid packrd", "com.Hp");
		WebsiteEntity websiteEntity15=new WebsiteEntity( "gold", "www.goldprice.com", 1980, "shivu", "com.goldprice");
		WebsiteEntity websiteEntity16=new WebsiteEntity( "cowin", "www.cowin.com", 2020, "China", "com.carona");
		WebsiteEntity websiteEntity17=new WebsiteEntity( "onlinesbi", "www.onlinesbi.com", 1890, "SBI", "com.SBI");
		WebsiteEntity websiteEntity18=new WebsiteEntity( "WWE", "www.wwe.com", 1970, "S.Balbir Sinsgh", "www.gndecb.ac.in");
		WebsiteEntity websiteEntity19=new WebsiteEntity( "royalchallengers", "www.royalchallengers.com", 1980, "united spiritts", "www.gndecb.ac.in");
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		dao.save(websiteEntity);
		dao.save(websiteEntity1);
		dao.save(websiteEntity2);
		dao.save(websiteEntity3);
		dao.save(websiteEntity4);
		dao.save(websiteEntity5);
		dao.save(websiteEntity6);
		dao.save(websiteEntity7);
		dao.save(websiteEntity8);
		dao.save(websiteEntity9);
		dao.save(websiteEntity10);
		dao.save(websiteEntity11);
		dao.save(websiteEntity12);
		dao.save(websiteEntity13);
		dao.save(websiteEntity14);
		dao.save(websiteEntity15);
		dao.save(websiteEntity16);
		dao.save(websiteEntity17);
		dao.save(websiteEntity18);
		dao.save(websiteEntity19);
		
		
		
	}

}
