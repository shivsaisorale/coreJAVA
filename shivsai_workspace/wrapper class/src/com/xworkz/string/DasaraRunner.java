package com.xworkz.string;

public class DasaraRunner {

	public static void main(String[] args) {
		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		

		String Txt="Hello World";
		System.out.println(Txt.toLowerCase());
		
		
		String branch=new String("BTM");
		boolean containsGE=branch.contains("TM");
		System.out.println(branch.contains("TM"));
		
		String indexmethod="i am good";
		System.out.println(indexmethod.indexOf("good"));
		
		String kiran="i am form Bidar";
		System.out.println(kiran.length());
		

	}

}
