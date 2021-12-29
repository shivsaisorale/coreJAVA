package com.xworkz.exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Statescammer {

	public static void main(String[] args) {
		
		State dto1=new State("Karanatak",30,50,"Basava");
		State dto2=new State("ANdhara pradesh",34,52,"kiran");
		State dto3=new State("Tamilnadu",35,54,"shivu");
		State dto4=new State("kerala",45,56,"sai");
		State dto5=new State("bihar",36,58,"umesh");
		State dto6=new State("goa",31,59,"nagapppa");
		State dto7=new State("gujarat",28,61,"naganna");
		State dto8=new State("haryana",29,70,"nagajja");
		State dto9=new State("Assam",35,72,"anmol");
		State dto10=new State("Madya pradesh",35,72,"prashant");
	
		List<State> state =new ArrayList<State>();
		state.add(dto1);
		state.add(dto2);
		state.add(dto3);
		state.add(dto4);
		state.add(dto5);
		state.add(dto6);
		state.add(dto7);
		state.add(dto8);
		state.add(dto9);
		state.add(dto10);
		
		boolean ref= state.contains(dto10);
		System.out.println(ref);
		
		boolean ref1=state.remove(dto2);
		System.out.println(ref1);
		
		System.out.println(state.size());
		
		Iterator<State> itr=state.iterator();
		while(itr.hasNext()) {
			State element= itr.next();
			System.out.println(element);
		}
		state.clear();
		System.out.println("Collection is clear");
	}

	

}
