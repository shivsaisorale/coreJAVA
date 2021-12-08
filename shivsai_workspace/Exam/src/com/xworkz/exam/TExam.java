package com.xworkz.exam;

public class TExam {

	public static void main(String[] args) {
		String str="Hello trinity welcome to xworkz";
		String reversedstr=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reversedstr=reversedstr+str.charAt(i);
		}
		System.out.println("input"+""+str);
		System.out.println("output"+reversedstr);
		
	}
}

