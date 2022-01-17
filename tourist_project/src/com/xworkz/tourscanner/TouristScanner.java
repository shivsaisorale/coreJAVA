package com.xworkz.tourscanner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristScanner {

	public static void main(String[] args) {

		List<TouristEntity> touristEntity=new ArrayList<TouristEntity>();
		touristEntity.add(new TouristEntity(1,"NandiHills", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(2,"Hampi", 10,"cload",200, "summer"));
		touristEntity.add(new TouristEntity(3,"Badami", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(4,"Mysore Aihole", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(5,"Aihole", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(6,"Bidar fort", 10,"cload",400, "summer"));
		touristEntity.add(new TouristEntity(7,"Pattadakal", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(8,"Bijapura ", 10,"cload",400, "rainy"));
		touristEntity.add(new TouristEntity(9,"Mary island", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(10,"Nilakandi falls", 10,"cload",200, "rainy"));
		touristEntity.add(new TouristEntity(11,"Bandipur National ", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(12,"Nagara hole", 10,"cload",400, "rainy"));
		touristEntity.add(new TouristEntity(13,"Kodachadri", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(14,"Dandeli", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(15,"Netrani", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(16,"Kumara pravatha", 10,"cload",200, "rainy"));
		touristEntity.add(new TouristEntity(17,"Black sand Beach", 10,"cload",400, "rainy"));
		touristEntity.add(new TouristEntity(18,"Om Beach", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(19,"Kapu Beach", 10,"cload",400, "rainy"));
		touristEntity.add(new TouristEntity(20,"panambur beach", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(21,"Someshaware", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(22,"Tannirabhavi", 10,"cload",400, "rainy"));
		touristEntity.add(new TouristEntity(23,"HAL", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(24,"Sandalwood", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(25,"Museum", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(26,"INS chapal warshipo", 10,"cload",100, "rainy"));
		touristEntity.add(new TouristEntity(27,"Jayachamarajendra", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(28,"Lumbani", 10,"cload",200, "rainy"));
		touristEntity.add(new TouristEntity(29,"Wonderlwa", 10,"cload",400, "summer"));
		touristEntity.add(new TouristEntity(30,"Snow city", 10,"cload",200, "winter"));
		touristEntity.add(new TouristEntity(31,"Brindavan ", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(32,"Cubbon park", 10,"cload",400, "summer"));
		touristEntity.add(new TouristEntity(33,"lalbhag", 10,"cload",200, "winter"));
		touristEntity.add(new TouristEntity(34,"Ramohalli", 10,"cload",400, "summer"));
		touristEntity.add(new TouristEntity(35,"Coorg", 10,"cload",400, "wenter"));
		touristEntity.add(new TouristEntity(36,"Kudremukh", 10,"cload",200, "summer"));
		touristEntity.add(new TouristEntity(37,"Sakleshpur", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(38,"Agmube", 10,"cload",200, "wenter"));
		touristEntity.add(new TouristEntity(39,"Chikmagaluru", 10,"cload",100, "wenter"));
		touristEntity.add(new TouristEntity(40,"Kemmanagudi", 10,"cload",400, "summer"));
		touristEntity.add(new TouristEntity(41,"Zarna", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(42,"Guru Nanak dev bidar", 10,"cload",400, "summer"));
		touristEntity.add(new TouristEntity(43,"papnash", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(44,"sundal", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(45,"Kadri manjunath", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(46,"Murudeswara", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(47,"udsapi", 10,"cload",400, "winter"));
		touristEntity.add(new TouristEntity(48,"Omkareswara temple", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(49,"jamia", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(50,"gomatagiri", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(51,"Dharmastala", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(52,"Savira kambadad basadi", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(53,"bhalki", 10,"cload",300, "wenter"));
		touristEntity.add(new TouristEntity(54,"Gokarna beach", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(55,"chikamagaluru", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(56,"joga galapata", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(57,"goa", 10,"cload",100, "wenter"));
		touristEntity.add(new TouristEntity(58,"shiridi", 10,"cload",200, "summer"));
		touristEntity.add(new TouristEntity(59,"sanishignapura", 10,"cload",300, "wenter"));
		touristEntity.add(new TouristEntity(60,"tirupati", 10,"cload",300, "wenter"));
		touristEntity.add(new TouristEntity(61,"krisna nadi", 10,"cload",300, "summer"));
		touristEntity.add(new TouristEntity(62,"malli falls ", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(63,"beluru", 10,"cload",200, "winter"));
		touristEntity.add(new TouristEntity(64,"hassan ", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(65,"surala falls", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(66,"surala falls", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(67,"parasgada", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(68,"rakaskop", 10,"cload",300, "summer"));
		touristEntity.add(new TouristEntity(69,"vaijnath", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(70,"kapileswar", 10,"cload",300, "summer"));
		touristEntity.add(new TouristEntity(71,"rakaskop", 10,"cload",100, "winter"));
		touristEntity.add(new TouristEntity(72,"kitturu falls", 10,"cload",300, "winter"));
		touristEntity.add(new TouristEntity(73,"bhimgada asram", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(74,"NandiHills", 10,"cload",200, "winter"));
		touristEntity.add(new TouristEntity(75,"banerukhatta", 10,"cload",300, "summer"));
		touristEntity.add(new TouristEntity(76,"kamala basti", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(77,"rajahansged fort", 10,"cload",100, "summer"));
		touristEntity.add(new TouristEntity(78,"saudatii", 10,"cload",200, "summer"));

		
		
		TouristDAO dao = new TouristDAOImpl();

		dao.put(touristEntity);
	}

}
