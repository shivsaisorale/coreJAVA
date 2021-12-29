package com.xworkz.exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PalaceScammer {

	public static void main(String[] args) {
		
		
		Palace dto1 =new Palace("Mysorepalace","Mysore",100,"9am","7pm");
		Palace dto2 =new Palace("BidarFort","bidar",400,"7am","7pm");
		Palace dto3 =new Palace("Bangalorepalace","Banagalore",500,"9am","7pm");
		Palace dto4 =new Palace("Tipu Sultan","Srirangapatna",600,"6am","6pm");
		Palace dto5 =new Palace("Lalitha","Mysore",133,"9am","7pm");
		Palace dto6 =new Palace("Jaganmohan","Mysore",400,"9am","7pm");
		Palace dto7 =new Palace("Amba Vilas ","Mysore",300,"9am","7pm");
		Palace dto8 =new Palace("Mysorepalace","Mysore",500,"9am","7pm");
		Palace dto9 =new Palace("NalknadPalace","Kodagu",500,"9am","7pm");
		Palace dto10 =new Palace("Mysorepalace","Mysore",10,"9am","7pm");
		
		List<Palace> palace =new ArrayList<Palace>();
		palace.add(dto1);
		palace.add(dto2);
		palace.add(dto3);
		palace.add(dto4);
		palace.add(dto5);
		palace.add(dto6);
		palace.add(dto7);
		palace.add(dto8);
		palace.add(dto9);
		palace.add(dto10);
		
		boolean ref= palace.contains(dto10);
		System.out.println(ref);
		
		boolean ref1=palace.remove(dto2);
		System.out.println(ref1);
		
		System.out.println(palace.size());
		
		Iterator<Palace> itr=palace.iterator();
		while(itr.hasNext()) {
			Palace element= itr.next();
			System.out.println(element);
		}
		  palace.clear();
		System.out.println("Collection is clear");
	}

}
