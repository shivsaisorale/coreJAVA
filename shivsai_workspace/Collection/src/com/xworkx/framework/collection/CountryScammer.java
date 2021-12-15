package com.xworkx.framework.collection;

public class CountryScammer {

	public static void main(String[] args) {

		CountryDAO dao = new CountryDAO();
		dao.save("India");
		dao.save("China");
		dao.save("Shrilanka");
		dao.save("Germany");
		dao.save("Australla");

		boolean findMatchName = dao.findMatchName("India");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("Shrilanka");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("ch");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("la");
		System.out.println(findMatchEndswith);

	}

}
