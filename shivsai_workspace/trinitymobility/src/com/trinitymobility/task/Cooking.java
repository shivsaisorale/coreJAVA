package com.trinitymobility.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cooking {
    
		public void listOfVarieties() {
		List list = new ArrayList();
		list.add("idli");
		list.add("dosa");
		list.add("puri");
		list.add("rice");
		list.add("palav");
		
		System.out.println("num of food");
		System.out.println(list);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("add 1 item");
		System.out.println("remove 1 item");
		int a = scanner.nextInt();
		
		if(a ==1) {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("add new item");
		String newitem = scanner2.next();
		list.add(newitem);
		System.out.println("after adding updated");
		System.out.println(list);
		
		}else if(a ==2) {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("remove from the list");
			String removeitem = scanner2.next();
			list.remove(removeitem);
			System.out.println("updated item list after removing...");
		}else {
			System.out.println("enter a valid number");
			int scanner2 = scanner.nextInt();
		}
	}
	
	public void foodIsTasty() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("food is good or not");
		boolean taste = scanner.nextBoolean();
		if(taste == true) {
			System.out.println("food is good");
		}else {
			System.out.println("food is bad");
		}
	}
	
	
}
