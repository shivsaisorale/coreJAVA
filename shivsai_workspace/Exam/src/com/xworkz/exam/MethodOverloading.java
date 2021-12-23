package com.xworkz.exam;

public class MethodOverloading {

	public void disp(char c) 
	
	{
		System.out.println(c);
	}
 
	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}

class Sample {
	public static void main(String args[])
	   {
		   MethodOverloading obj = new MethodOverloading();
	       obj.disp('a');
	       obj.disp('a',10);
	   }
}