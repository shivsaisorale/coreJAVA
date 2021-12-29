package com.xworkz.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActorScammer {

	public static void main(String[] args) {

		Actor hero1 = new Actor("Puneet", 'M', 46, true, "kannada");
		Actor hero2 = new Actor("DARSHAN", 'M', 42, true, "kannada");
		Actor hero3 = new Actor("Suddepa", 'M', 38, true, "kannada");
		Actor hero4 = new Actor("Rajakumar", 'M', 77, false, "kannada");
		Actor hero5 = new Actor("yasha", 'M', 60, true, "kannada");
		Actor hero6 = new Actor("ajaya", 'M', 66, true, "kannada");
		Actor hero7 = new Actor("Drava", 'M', 70, false, "kannada");
		Actor hero8 = new Actor("Vikrama", 'M', 56, true, "kannada");
		Actor hero9 = new Actor("dhanajaya", 'M', 43, true, "kannada");
		Actor hero10 = new Actor("allu Arjun", 'M', 41, true, "kannada");

		List<Actor> hero = new ArrayList<Actor>();
		hero.add(hero1);
		hero.add(hero2);
		hero.add(hero3);
		hero.add(hero4);
		hero.add(hero5);
		hero.add(hero6);
		hero.add(hero7);
		hero.add(hero8);
		hero.add(hero9);
		hero.add(hero10);

		boolean ref = hero.contains(hero10);
		System.out.println(ref);

		boolean ref1 = hero.remove(hero8);
		System.out.println(ref1);

		System.out.println(hero.size());

		Iterator<Actor> itr = hero.iterator();
		while (itr.hasNext()) {
			Actor element = itr.next();
			System.out.println(element);
		}
		hero.clear();
		System.out.println("Collection is clear");
	}

}
