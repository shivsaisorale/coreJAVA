package com.xworkx.framework.collection.dao;

class BeerDAOScammer {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		System.out.println();
		boolean match = beerDAO.operations((arg1, arg2) -> {
			return arg1.equals(arg2);
		}, "Budweiser");
		System.out.println(match);

		System.out.println();
		boolean matchIgnore = beerDAO.operations((arg1, arg2) -> {
			return arg2.equalsIgnoreCase(arg1);
		}, "budweiser");
		System.out.println(matchIgnore);

		System.out.println();
		boolean startsWith = beerDAO.operations((arg1, arg2) -> {
			return arg1.startsWith(arg2);
		}, "ui");
		System.out.println(startsWith);

		System.out.println();
		boolean endsWith = beerDAO.operations((arg1, arg2) -> {
			return arg1.endsWith(arg2);
		}, "zz");
		System.out.println(endsWith);

	}

}
