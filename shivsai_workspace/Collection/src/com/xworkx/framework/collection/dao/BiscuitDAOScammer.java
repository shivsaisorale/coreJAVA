package com.xworkx.framework.collection.dao;

public class BiscuitDAOScammer {

	
			public static void main(String[] args) {
				
				BiscuitDAO biscuit=new BiscuitDAO();
				
				System.out.println();
				boolean match = biscuit.Find((arg1, arg2) -> {
					return arg1.equals(arg2);
				}, "Hide seek");
				System.out.println(match);

				System.out.println();
				boolean matchIgnore = biscuit.Find((arg1, arg2) -> {
					return arg2.equalsIgnoreCase(arg1);
				}, "Burboun");
				System.out.println(matchIgnore);

				System.out.println();
				boolean startsWith = biscuit.Find((arg1, arg2) -> {
					return arg1.startsWith(arg2);
				}, "Or");
				System.out.println(startsWith);

				System.out.println();
				boolean endsWith = biscuit.Find((arg1, arg2) -> {
					return arg1.endsWith(arg2);
				}, "Mo");
				System.out.println(endsWith);
		}

}
