package com.xworkx.framework.collection;

public class PlaceScammer {

	public static void main(String[] args) {

		PlaceDAO dao = new PlaceDAO();
		dao.save("Bagalkot");
		dao.save("Hampi");
		dao.save("Hospet");
		dao.save("Gangavati");
		dao.save("Hassan");

		boolean findMatchName = dao.findMatchName("Hampi");
		System.out.println(findMatchName);

		boolean findMatchCaseInsensitive = dao.findMatchCaseInsensitive("Hospet");
		System.out.println(findMatchCaseInsensitive);

		boolean findMatchStartswith = dao.findMatchStartswith("ga");
		System.out.println(findMatchStartswith);

		boolean findMatchEndswith = dao.findMatchEndswith("an");
		System.out.println(findMatchEndswith);

	}

}
