package com.xworkz.wrapper1;

public class wrapperStarter {

	public static void main(String[] args) {
		
		int a=20;
		System.out.println(Integer.bitCount(111));
		System.out.println(Integer.toBinaryString(134));
		System.out.println(Integer.toString(180));
		System.out.println(Integer.compare(100,290));
		System.out.println(Integer.min(1000,100));
		
		float b=30;
		System.out.println(Float.floatToIntBits(2.2f));
		System.out.println(Float.compare(2.2f,3.3f));
		System.out.println(Float.floatToIntBits(5.5f));
		System.out.println(Float.max(44.5f, 55.5f));
		System.out.println(Float.min(11.2f,10.3f));
		
		double c=40;
		System.out.println(Double.compare(60,70));
		System.out.println(Double.doubleToLongBits(30));
		System.out.println(Double.min(21, 31));
		System.out.println(Double.max(50,60));
		System.out.println(Double.longBitsToDouble(20));
		
		boolean bool=true;
		System.out.println(Boolean.compare(true,false));
		System.out.println(Boolean.getBoolean(null));
		System.out.println(Boolean.logicalAnd(true,true));
		System.out.println(Boolean.logicalOr(false,true));
		System.out.println(Boolean.logicalXor(true,false));
		
		
		
		
		
		
	
	}

}
