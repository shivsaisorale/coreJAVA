package com.xworkz.programs;

public class RevString {

	public static void main(String[] args) {

		String srt="I am shivsai";
		String ref="";
		
		for(int i=srt.length()-1; i>=0; i--) {
			ref=ref+srt.charAt(i);
			
			System.out.println("originale srt"+srt);
			System.out.println("revrse of given"+ref);
		}
	}

}
