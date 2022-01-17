package com.xworkz.tourscanner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.RailwayStationDAO;
import com.xworkz.tour.dao.RailwayStationDAOImpl;

import com.xworkz.tour.entity.RailwayStationEntity;

public class RailwayStationScanner {

	public static void main(String[] args) {
	
		
		List<RailwayStationEntity> list = new ArrayList<RailwayStationEntity>();
		list.add(new RailwayStationEntity(1,"BidarRailwayStation","Bidar",2,2,2));
		list.add(new RailwayStationEntity(2,"KSR Bengaluru RailwayStation","Bengaluru",5,9,4));
		list.add(new RailwayStationEntity(3,"Yasvantapur RailwayStation","Bengaluru",4,8,5));
		list.add(new RailwayStationEntity(4,"Raichur RailwayStation","Raichur",2,3,3));
		list.add(new RailwayStationEntity(5,"Mysuru RailwayStation","Mysuru",2,2,4));
		list.add(new RailwayStationEntity(6,"bangarapetr RailwayStation","bangarapetr",2,2,5));
		list.add(new RailwayStationEntity(7,"managaluruy RailwayStation","managaluruy",2,2,6));
		list.add(new RailwayStationEntity(8,"hubbali RailwayStation","hubbali",2,2,5));
		list.add(new RailwayStationEntity(9,"davangere RailwayStation","davangere",2,2,4));
		list.add(new RailwayStationEntity(11,"dharwad RailwayStation","dharwad",2,2,3));
		list.add(new RailwayStationEntity(12,"mandya RailwayStation","mandya",2,2,3));
		list.add(new RailwayStationEntity(13,"yadgiri RailwayStation","yadgiri",2,2,3));
		list.add(new RailwayStationEntity(14,"belgavi RailwayStation","belgavi",2,2,4));
		list.add(new RailwayStationEntity(17,"ballari RailwayStation","ballari",2,2,5));
		list.add(new RailwayStationEntity(18,"arisikere RailwayStation","ballari",2,2,6));
		list.add(new RailwayStationEntity(19,"tumkurur RailwayStation","tumkurur",2,2,7));
		list.add(new RailwayStationEntity(20,"Krishanaraj RailwayStation","Krishanaraj",2,2,5));
		list.add(new RailwayStationEntity(21,"Londan RailwayStation","Londan",2,2,4));
		list.add(new RailwayStationEntity(22,"Birur RailwayStation","Birur",2,2,7));
		list.add(new RailwayStationEntity(23,"londan RailwayStation","londan",2,2,3));
		list.add(new RailwayStationEntity(24,"gadag RailwayStation","gadag",2,2,4));
		list.add(new RailwayStationEntity(25,"hosapete RailwayStation","Bengaluru",2,2,5));
		list.add(new RailwayStationEntity(26,"vaijayanagar RailwayStation","Bengaluru",2,2,3));
		list.add(new RailwayStationEntity(27,"malura RailwayStation","Bengaluru",2,2,6));
		list.add(new RailwayStationEntity(28,"sagar  RailwayStation","sagar",2,2,5));
		list.add(new RailwayStationEntity(29,"shivamogga RailwayStation","shivamogga",2,2,6));
		list.add(new RailwayStationEntity(30,"ullal RailwayStation","ullal",2,2,3));
		list.add(new RailwayStationEntity(31,"udupi RailwayStation","udupi",2,2,5));
		list.add(new RailwayStationEntity(32,"karwar RailwayStation","karwar",2,2,6));
		list.add(new RailwayStationEntity(33,"haveri RailwayStation","haveri",2,2,3));
		list.add(new RailwayStationEntity(34,"ranibennur RailwayStation","ranibennur",2,2,5));
		list.add(new RailwayStationEntity(35,"kundapura RailwayStation","kundapura",2,2,6));
		list.add(new RailwayStationEntity(36,"shahadabad RailwayStation","shahadabad",2,2,5));
		list.add(new RailwayStationEntity(37,"bhatkal RailwayStation","bhatkal",2,2,4));
		list.add(new RailwayStationEntity(38,"maddur RailwayStation","maddur",2,2,3));
		list.add(new RailwayStationEntity(39,"kumta","kumta",2,2,6));
		list.add(new RailwayStationEntity(40,"chittapur RailwayStation","chittapur",2,2,5));
		list.add(new RailwayStationEntity(41,"sedam RailwayStation","sedam",2,2,3));
		list.add(new RailwayStationEntity(42,"bhalki RailwayStation","bhalki",2,2,6));
		list.add(new RailwayStationEntity(43,"latur RailwayStation","latur",2,2,3));
		list.add(new RailwayStationEntity(44,"baglkote RailwayStation","baglkote",2,2,5));
		list.add(new RailwayStationEntity(45,"kudachi RailwayStation","kudachi",2,2,6));
		list.add(new RailwayStationEntity(46,"tumkuru RailwayStation","tumkuru",2,2,7));
		list.add(new RailwayStationEntity(47,"saidapur RailwayStation","saidapur",2,2,8));
		list.add(new RailwayStationEntity(48,"badami RailwayStation","badami",2,2,5));
		list.add(new RailwayStationEntity(49,"rayabag RailwayStation","rayabag",2,2,4));
		list.add(new RailwayStationEntity(50,"hole RailwayStation","hole",2,2,4));
		list.add(new RailwayStationEntity(51,"khanapur RailwayStation","khanapur",2,2,5));
		list.add(new RailwayStationEntity(52,"tyakal RailwayStation","tyakal",2,2,3));
		list.add(new RailwayStationEntity(53,"kamal RailwayStation","kamal",2,2,4));
		list.add(new RailwayStationEntity(54,"byadgi RailwayStation","byadgi",2,2,5));
		list.add(new RailwayStationEntity(55,"indi RailwayStation","indi",2,2,4));
		list.add(new RailwayStationEntity(56,"mallapur RailwayStation","mallapur",2,2,7));
		list.add(new RailwayStationEntity(57,"kurugunbta RailwayStation","kurugunbta",2,2,6));
		list.add(new RailwayStationEntity(58,"chinchi RailwayStation","chinchi",2,2,8));
		list.add(new RailwayStationEntity(59,"matmari RailwayStation","matmari",2,2,4));
		list.add(new RailwayStationEntity(60,"ugar RailwayStation","ugar",2,2,3));
		list.add(new RailwayStationEntity(61,"kambaraganvi RailwayStation","kambaraganvi",2,2,5));
		list.add(new RailwayStationEntity(62,"yelluru RailwayStation","yelluru",2,2,6));
		list.add(new RailwayStationEntity(63,"halakatta RailwayStation","halakatta",2,2,7));
		list.add(new RailwayStationEntity(64,"desur RailwayStation","desur",2,2,3));
		list.add(new RailwayStationEntity(65,"bisanattam RailwayStation","bisanattam",2,2,6));
		list.add(new RailwayStationEntity(66,"desur RailwayStation","desur",2,2,6));
		list.add(new RailwayStationEntity(67,"vevgiri RailwayStation","vevgiri",2,2,4));
		list.add(new RailwayStationEntity(68,"douroji RailwayStation","douroji",2,2,5));
		list.add(new RailwayStationEntity(69,"hejjala RailwayStation","hejjala",2,2,6));
		list.add(new RailwayStationEntity(70,"tavargatti RailwayStation","tavargatti",2,2,4));
		list.add(new RailwayStationEntity(71,"karanjiu RailwayStation","karanjiu",2,2,3));
		list.add(new RailwayStationEntity(72,"ankola RailwayStation","ankola",2,2,4));
		list.add(new RailwayStationEntity(73,"kungil RailwayStation","kungil",2,2,5));
		list.add(new RailwayStationEntity(74,"mulki RailwayStation","mulki",2,2,4));
		list.add(new RailwayStationEntity(75,"chikka banavra RailwayStation","chikka",2,2,6));
		
		
		
		RailwayStationDAO dao = new RailwayStationDAOImpl();
		dao.saveAll(list);
	}
	

}
